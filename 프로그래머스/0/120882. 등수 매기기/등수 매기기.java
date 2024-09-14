import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int rank = len;
        
        int[] answer = new int[len];
        int[] ave = new int[len];

        for(int i = 0; i < len; i++) ave[i] = (score[i][0] + score[i][1]);
        
        Arrays.sort(ave);
        
        for(int j = 0; j < len; j++){
            for(int k = 0; k < len; k++){
                if((score[j][0] + score[j][1]) == ave[k]){
                    answer[j] = rank - k;
                }
            }
        }
        
        return answer;
    }
}