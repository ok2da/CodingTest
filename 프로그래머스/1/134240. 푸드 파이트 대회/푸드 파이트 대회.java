import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= food.length - 1; i++){
            int count = food[i];
            while(count > 1){
                sb.append(i);
                count -= 2;
            }
        }

        answer = sb.toString() + "0" + sb.reverse().toString();
        
        
        return answer;
    }
}