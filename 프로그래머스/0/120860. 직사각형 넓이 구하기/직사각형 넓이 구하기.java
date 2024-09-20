import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;

        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] < x_min) x_min = dots[i][0];
            if(dots[i][0] > x_max) x_max = dots[i][0];
            if(dots[i][1] < y_min) y_min = dots[i][1];
            if(dots[i][1] > y_max) y_max = dots[i][1];
        }
        
        answer = Math.abs(x_max - x_min) * Math.abs(y_max - y_min);
        
        return answer;
    }
}