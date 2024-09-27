import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        char[] cc = my_string.toCharArray();
        
        for(char c : cc){
            sb.append(("" + c).repeat(n));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}