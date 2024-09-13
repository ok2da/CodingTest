import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        for(int i = 0; i < before.length(); i++){
            char c = before.charAt(i);
            after = after.replaceFirst("" + c,"");
        }
        
        if(after.equals("")) answer++;
        
        return answer;
    }
}