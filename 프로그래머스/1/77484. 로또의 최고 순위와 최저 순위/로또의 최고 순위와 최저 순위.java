import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        for(int l : lottos){
                if(l == 0) {
                    answer[0]++;
                    continue;
                }
            for(int w : win_nums){
                if(l == w){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        answer[0] = Math.min(7 - answer[0], 6);
        answer[1] = Math.min(7 - answer[1], 6);
        
        return answer;
    }
}