import java.util.*;
class Solution {
    public int solution(String[] board) {
        int answer = -1;

        int max_x = board.length;
        int max_y = board[0].length();

        int[][] move = new int[max_x][max_y];
        Queue<int[]> queue = new LinkedList<>();
        int start_x = 0; int start_y = 0; int end_x = 0; int end_y = 0;

        // 상,하,좌,우
        int[] move_x = {0,0,-1,1};
        int[] move_y = {-1,1,0,0};

        for(int i = 0; i < max_x; i++){
            String str = board[i];
            for(int j = 0; j < max_y; j++){
                char c = str.charAt(j);

                if(c == '.'){
                    continue;
                }else if(c == 'D'){
                    move[i][j] = -1;
                }else if(c == 'R'){
                    move[i][j] = 1;
                    start_x = i;
                    start_y = j;
                }else if(c == 'G'){
                    end_x = i;
                    end_y = j;
                }

            }
        }

        // 현재좌표 x,y | 턴 횟수 | 이전좌표 x,y
        queue.offer(new int[]{start_x, start_y, 0});

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            int r = temp[2];

            // 목적지 일 경우
            if(x == end_x && y == end_y){
                answer = r;
                break;
            }

            for(int k = 0; k < 4; k++){
                int xx = x;
                int yy = y;

                while(true){
                    int next_x = xx + move_x[k];
                    int next_y = yy + move_y[k];
                    
                    // 최대 크기를 벗어날 경우 넘기기
                    if(next_x >= max_x || next_y >= max_y || next_x < 0 || next_y < 0) {
                        break;
                    }

                    // 진행 방향에 벽이 있을때
                    if(move[next_x][next_y] == -1) {
                        // 해당 벽 전이 목적지 일 경우
                        if(move[next_x][next_y] == -3){
                            return answer = r + 1;
                        }
                        break;
                    }
                    xx = next_x;
                    yy = next_y;
                    
                }

                // x와 y가 제한된 크기를 벗어나지 않고, 처음 방문지점 일 때
                if(xx >= 0 && yy >= 0 && xx < max_x && yy < max_y && move[xx][yy] == 0){
                    move[xx][yy] = 1;
                    queue.offer(new int[]{xx, yy, r + 1});
                }

            }

        }
        
        return answer;
    }
}