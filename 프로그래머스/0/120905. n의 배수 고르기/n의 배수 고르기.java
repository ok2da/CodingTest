import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int index = 0;
        
        for(int i = 0; i < numlist.length; i++){
            int num = numlist[i];
            
            if(num % n == 0) {
                numlist[index] = num;
                index++;
            }
        }
        
        answer = Arrays.copyOfRange(numlist, 0, index);
        
        return answer;
    }
}