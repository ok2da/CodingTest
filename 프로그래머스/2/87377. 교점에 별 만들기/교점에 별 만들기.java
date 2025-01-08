import java.util.*;
class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};

        List<int[]> points = new ArrayList<>();

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for(int i = 0; i < line.length; i++){
            for(int l = i + 1; l < line.length; l++){
                // x1, y1, c1 과 x2, y2, c2
                long A = line[i][0]; long B = line[i][1]; long E = line[i][2];
                long C = line[l][0]; long D = line[l][1]; long F = line[l][2];

                // 교점 계산
                long upX = ((B * F) - (E * D));
                long downX = ((A * D) - (B * C));
                long upY = ((E * C) - (A * F));
                long downY = ((A * D) - (B * C));

                // 평행 확인
                if(downX == 0) continue;

                // 정수 확인
                if (upX % downX == 0 && upY % downX == 0) {
                    int x = (int) (upX / downX);
                    int y = (int) (upY / downX);

                    points.add(new int[]{x, y});

                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }

            }
        }

        // 그리드 생성
        int width = maxX - minX + 1;
        int height = maxY - minY + 1;
        char[][] grid = new char[height][width];

        // 그리드 빈칸 '.' 으로 초기화
        for(int l = 0; l < height; l++){
            for(int k = 0; k < width; k++){
                grid[l][k] = '.';
            }
        }

        // 그리드 교점 '*' 으로 변경
        for(int[] point : points){
            int gridX = point[0] - minX;
            int gridY = maxY - point[1];
            grid[gridY][gridX] = '*';
        }

        answer = new String[(int) (maxY - minY + 1)];
        
        // char -> string 이전
        for(int o = 0; o < height; o++){
            answer[o] = new String(grid[o]);
        }


        return answer;
    }
}