import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        
        // 입차|출차 시간을 기록할 배열, 입차|출차 1세트 기준을 기록할 배열, 마지막 시각까지 안나온 차량을 기록할 배열, 차량 넘버를 기록할 배열
        int[][] time = new int[10000][1000];
        int[] index = new int[10000];
        boolean[] check = new boolean[10000];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < records.length; i++){
            int hour = Integer.parseInt(records[i].substring(0,2)) * 60;
            int min = Integer.parseInt(records[i].substring(3,5));
            int num = Integer.parseInt(records[i].substring(6,10));
            String action = records[i].substring(11);
            
            // IN일 경우, 시간은 time에 삽입, list에 차량 번호가 없을경우 추가, 출차를 기록할 boolean 갱신
            if(action.equals("IN")){
                if(!list.contains(num)) list.add(num);
                time[num][index[num]] += hour + min;
                check[num] = true;
            }else {
                // OUT일 경우, 출차 시간과 입차시간을 뺀 값으로 변경, 세트 기록회수 증가, 출차 boolean 갱신
                time[num][index[num]] = (hour + min) - time[num][index[num]];
                index[num]++;
                check[num] = false;
            }
        }
        
        // 차량번호가 작은 순서대로 정렬, 리턴할 배열 크기 생성
        Collections.sort(list);
        answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            int carNumber = list.get(j);
            int parkingTime = 0;
            
            // 출차 기록이 없을경우, 마지막 시간에서 입차시간을 빼서 갱신, 출차 boolean 갱신
            for(int k = index[carNumber]; k >= 0; k--){
                if(check[carNumber]){
                    parkingTime += 1439 - time[carNumber][k];
                    check[carNumber] = false;
                }else {
                    parkingTime += time[carNumber][k];
                }
            }
            // 총 주차시간이 기본시간보다 클 경우, 주어진 계산법에 따라 리턴 배열에 주차비용 추가
            if(parkingTime - fees[0] > 0){
                answer[j] = fees[1] + (int) Math.ceil((parkingTime * 1.0 - fees[0] * 1.0) / fees[2] * 1.0) * fees[3];
            }else {
                answer[j] = fees[1];
            }
        }
        
        return answer;
    }
}