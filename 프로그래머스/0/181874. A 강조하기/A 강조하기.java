import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        int index = 0;
   
        StringBuilder sb = new StringBuilder(myString.toLowerCase());
   
        while(index != -1){
            index = sb.indexOf("a");
            
            if(index != -1) sb.setCharAt(index,'A');
        }
        
        answer = sb.toString();
 
        return answer;
    }
}