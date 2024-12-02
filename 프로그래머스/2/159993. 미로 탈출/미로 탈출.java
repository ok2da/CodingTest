import java.util.*;
class Solution {
    static int len_y = 0;
    static int len_x = 0;
    static int start_y = 0;
    static int start_x = 0;
    static int lever_y = 0;
    static int lever_x = 0;
    static int exit_y = 0;
    static int exit_x = 0;
    static int[] move_y = {-1, 1, 0, 0};
    static int[] move_x = {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        int answer = -1;

        len_x = maps[0].length();
        len_y = maps.length;

        int[][] map = new int[len_y][len_x];

        for(int i = 0; i < len_y; i++){
            String line = maps[i];
            for(int j = 0; j < line.length(); j++){
                char square = line.charAt(j);
                switch(square){
                    case 'O':
                        break;
                    case 'X':
                        map[i][j] = -1;
                        break;
                    case 'S':
                        map[i][j] = 1;
                        start_y = i;
                        start_x = j;
                        break;
                    case 'L':
                        map[i][j] = 2;
                        lever_y = i;
                        lever_x = j;
                        break;
                    case 'E':
                        map[i][j] = 3;
                        exit_y = i;
                        exit_x = j;
                        break;
                }
            }
        }

        int distanceToLever = bfs(map, 2);
        int distanceToExit = bfs(map, 3);

        if(distanceToLever == -1 || distanceToExit == -1){
            answer = -1;
        }else {
            answer = distanceToLever + distanceToExit;
        }


        return answer;
    }

    public int bfs(int[][] map, int target){
        Queue<int[]> Q = new LinkedList<>();
        boolean[][] visited = new boolean[len_y][len_x];

        // 지점 설정
        if(target == 2) Q.offer(new int[]{start_y, start_x, 0});
        if(target == 3) Q.offer(new int[]{lever_y, lever_x, 0});

        while(!Q.isEmpty()){
            int[] step = Q.poll();
            int y = step[0];
            int x = step[1];
            int s = step[2];

            for(int k = 0; k < 4; k++){
                int my = y + move_y[k];
                int mx = x + move_x[k];

                // 지정 범위를 벗어날때 패스
                if(my == len_y || my < 0) continue;
                if(mx == len_x || mx < 0) continue;

                // 벽에 가로막혔을 때
                if(map[my][mx] == -1) continue;

                // 이미 왔던 길일때
                if(visited[my][mx]) continue;

                // 왔던 길 표시, 타겟이면 리턴
                if(map[my][mx] != target) {
                    visited[my][mx] = true;
                }else {
                    return s + 1;
                }

                Q.offer(new int[]{my, mx, s + 1});
            }

        }

        return -1;
    }
    
}