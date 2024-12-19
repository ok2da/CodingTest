import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];

        List<Double> list = new ArrayList<>();
        double max = 0.0;
        int lc = k;
        int n = 0;

        while(lc != 1){
            int c = lc % 2 == 0 ? lc / 2 : (lc * 3) + 1;
            double r = 1.0 / 2.0 * (lc + c) * 1;
            list.add(r);
            lc = c;
            max += r;
        }

        n = list.size();

        for(int j = 0; j < answer.length; j++){
            int x = ranges[j][0];
            int y = ranges[j][1];
            if(x == 0 && y == 0) {
                answer[j] = max;
                continue;
            }
            if(x < n + y) {
                for(int l = x; l < n + y; l++){
                    answer[j] += list.get(l);
                }
                continue;
            }
            if(x == n + y) {
                answer[j] = 0.0;
                continue;
            }
            if(x > n + y) {
                answer[j] = -1.0;
                continue;
            }
        }
        
        return answer;
    }
}