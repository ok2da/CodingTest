import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int len = book_time.length;

        int[][] time = new int[len][2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < len; i++){
            String st = book_time[i][0];
            String et = book_time[i][1];

            time[i][0] = Integer.parseInt(st.substring(0,2)) * 60 + Integer.parseInt(st.substring(3));
            time[i][1] = Integer.parseInt(et.substring(0,2)) * 60 + Integer.parseInt(et.substring(3));
        }

        Arrays.sort(time, (o1, o2) -> o1[0] - o2[0]);

        for(int j = 0; j < len; j++){
            int start = time[j][0];
            int end = time[j][1] + 10;

            // 손님이 아무도 없을때
            if(pq.isEmpty()) {
                pq.add(end);
                answer++;
            }else {
                // 가장 빠른 퇴실 손님의 시간 이후일 경우 방 재사용
                if(pq.peek() <= start) pq.poll();
                pq.add(end);
            }

        }
        
        answer = pq.size();
        
        return answer;
    }
}