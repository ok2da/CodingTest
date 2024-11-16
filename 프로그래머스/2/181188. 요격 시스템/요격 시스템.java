import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int missile = 0;

        for(int i = 0; i < targets.length; i++){
            int s = targets[i][0];
            int e = targets[i][1];

            if(missile <= s){
                missile = e;
                answer++;
            }

        }
        
        return answer;
    }
}