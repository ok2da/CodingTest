import java.util.*;
class Solution {  
    
    static int[] move_y = {-1,1,0,0};
    static int[] move_x = {0,0,-1,1};
    
    public int[] solution(String[] maps) {
        int[] answer = {};
        
        int len_y = maps.length;
        int len_x = maps[0].length();

        int[][] island = new int[len_y][len_x];
        
        Queue<int[]> Q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < len_y; i++){
            String str = maps[i];
            for(int j = 0; j < len_x; j++){
                char c = str.charAt(j);
                island[i][j] = c < 58 ? c - 48 : 0;
            }
        }

        for(int k = 0; k < len_y; k++){
            for(int l = 0; l < len_x; l++){
                if(island[k][l] > 0){
                    Q.offer(new int[]{k, l});
                    int result = 0;

                    while(!Q.isEmpty()){
                        int[] temp = Q.poll();
                        int y = temp[0];
                        int x = temp[1];

                        for(int m = 0; m < 4; m++){
                            // 크기를 벗어나거나, 섬이 아닐때 패스
                            if(y + move_y[m] == -1 || y + move_y[m] == len_y) continue;
                            if(x + move_x[m] == -1 || x + move_x[m] == len_x) continue;
                            if(island[y + move_y[m]][x + move_x[m]] <= 0) continue;


                            Q.offer(new int[]{y + move_y[m],x + move_x[m]});
                            result += island[y + move_y[m]][x + move_x[m]];
                            island[y + move_y[m]][x + move_x[m]] = -1;
                        }

                    }

                    // 외딴섬이면 해당 섬의 시간을, 아니라면 지나왔던 머물렀던 시간을 삽입
                    if(result == 0){
                        pq.offer(island[k][l]);
                    }else {
                        pq.offer(result);
                    }
                }
            }
        }

        if(pq.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[pq.size()];
            for(int n = 0; n < answer.length; n++){
                answer[n] = pq.poll();
            }
        }
        
        return answer;
    }

}