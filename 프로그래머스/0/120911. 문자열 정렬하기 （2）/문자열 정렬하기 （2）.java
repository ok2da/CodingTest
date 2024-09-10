import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        
        answer = String.valueOf(c);
        
        return answer;
    }
}