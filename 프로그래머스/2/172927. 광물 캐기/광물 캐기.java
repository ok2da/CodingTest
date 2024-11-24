import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        
        // 조건1 ) 최소한의 피로도로 광물을 캠
        // 조건2 ) 다이아, 철, 돌 곡괭이중 아무거나 하나 선택해서 광물을 캠
        // 조건3 ) 곡괭이는 종류에 상관없이 광물 5개를 캐고 사용할 수 없음
        // 조건4 ) 한 번 사용한 곡괭이는 끝까지 사용
        // 조건5 ) 광물은 순서대로만 캘 수 있음
        // 조건6 ) 모든 광물을 캐거나, 사용할 곡괭이가 없을 때 까지 광물을 캠
        
        // 결과 = 작업을 끝내기 까지 필요한 최소한의 피로도를 return

        int len = minerals.length;
        int[][] efficiency = new int[(len + 4) / 5][3];


        // 피로도, 곡괭이, 곡괭이 내구도
        int answer = 0;
        int pickaxe = -1;

        // 광물에 따른 곡괭이 효율 계산
        for(int i = 0; i < minerals.length; i++){
            
            // 곡괭이의 수가 더 적을경우
            if(i / 5 == picks[0] + picks[1] + picks[2]){
                break;
            }
            
            // 0 = 다이아 곡괭이, 1 = 철 곡괭이, 2 = 돌 곡괭이
            switch(minerals[i]){
                case "diamond":
                    efficiency[i / 5][0] += 1;
                    efficiency[i / 5][1] += 5;
                    efficiency[i / 5][2] += 25;
                    break;
                case "iron":
                    efficiency[i / 5][0] += 1;
                    efficiency[i / 5][1] += 1;
                    efficiency[i / 5][2] += 5;
                    break;
                case "stone":
                    efficiency[i / 5][0] += 1;
                    efficiency[i / 5][1] += 1;
                    efficiency[i / 5][2] += 1;
                    break;
            }
        }

        // 피로도 효율 정렬
        Arrays.sort(efficiency, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        // 채광
        for(int j = 0; j < efficiency.length; j++){
            if(picks[0] != 0){
                answer += efficiency[j][0];
                picks[0]--;
            }else if(picks[1] != 0){
                answer += efficiency[j][1];
                picks[1]--;
            }else if(picks[2] != 0){
                answer += efficiency[j][2];
                picks[2]--;
            }
        }

        return answer;
    }
}