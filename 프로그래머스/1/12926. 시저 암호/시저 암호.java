import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 공백
            if(c == ' '){
                sb.append(' ');
                continue;
            }
            // 소문자
            if(c >= 97){
                if(c + n > 122){
                    sb.append( (char) ((c + n) - 122 + 96) );
                }else {
                    sb.append( (char) (c + n) );
                }
                continue;
            }
            // 대문자
            if(c >= 65){
                if(c + n > 90){
                    sb.append( (char) ((c + n) - 90 + 64) );
                }else {
                    sb.append( (char) (c + n) );
                }
                continue;
            }
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}