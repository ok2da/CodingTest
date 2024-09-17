class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        double a = (double) (x2 - x1) / (y2 - y1);
        double b = (double) (x4 - x3) / (y4 - y3);
        if(a == b) answer = 1;

        a = (double) (x3 - x1) / (y3 - y1);
        b = (double) (x2 - x4) / (y2 - y4);
        if(a == b) answer = 1;

        a = (double) (x4 - x1) / (y4 - y1);
        b = (double) (x3 - x2) / (y3 - y2);
        if(a == b) answer = 1;
            
        return answer;
    }
}