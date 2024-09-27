import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // StringBuilder sb = new StringBuilder(my_string).reverse();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = my_string.length() - 1; i >= 0; i--){
            char c = my_string.charAt(i);
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}