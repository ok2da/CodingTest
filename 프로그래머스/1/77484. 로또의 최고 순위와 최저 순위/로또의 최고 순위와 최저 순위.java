import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        String rank = "";

        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0){
                answer[0]--;
            }else {
                rank += "[" + lottos[i] + "]";
            }
        }
        
        for(int j = 0; j < 6; j++){
            if(rank.indexOf("[" + win_nums[j] + "]") != -1){
                answer[0]--;
                answer[1]--;
            }
        }
        
        if(answer[0] == 7) answer[0]--;
        if(answer[1] == 7) answer[1]--;

        
        return answer;
    }
}