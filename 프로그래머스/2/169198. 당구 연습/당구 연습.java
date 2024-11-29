class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        for (int i = 0; i < balls.length; i++) {
            int ballX = balls[i][0];
            int ballY = balls[i][1];

            int temp = 0;
            int result = Integer.MAX_VALUE;

            // 상, 하, 좌, 우
            if (!(startX == ballX && startY <= ballY)) {
                temp = cal(startX, startY, ballX, n + (n - ballY));
                result = Math.min(temp, result);
            }
            if (!(startX == ballX && startY >= ballY)) {
                temp = cal(startX, startY, ballX, ballY * (-1));
                result = Math.min(temp, result);
            }
            if (!(startY == ballY && startX >= ballX)) {
                temp = cal(startX, startY, ballX * (-1), ballY);
                result = Math.min(temp, result);
            }
            if (!(startY == ballY && startX <= ballX)) {
                temp = cal(startX, startY, m + (m - ballX), ballY);
                result = Math.min(temp, result);
            }

            answer[i] = result;
        }

        return answer;
    }
    
    public int cal(int sx, int sy, int bx, int by) {
        return (int) (Math.pow(sx - bx, 2) + Math.pow(sy - by, 2));
    }
}