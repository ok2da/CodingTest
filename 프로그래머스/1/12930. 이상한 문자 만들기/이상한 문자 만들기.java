import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        boolean index = false;
        
        StringBuilder sb = new StringBuilder();
        
 
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);

            // 공백 검사
            if(c != 32){
                // 짝수, 홀수 판별
                if(!index){
                    index = true;
                    if(c < 97){
                        sb.append(c);
                    }else {
                        sb.append((char) (c - 32));
                    }
                }else {
                    index = false;
                    if(c < 97){
                        sb.append((char) (c + 32));
                    }else {
                        sb.append(c);
                    }
                }
            }else {
                index = false;
                sb.append(c);
            }
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}