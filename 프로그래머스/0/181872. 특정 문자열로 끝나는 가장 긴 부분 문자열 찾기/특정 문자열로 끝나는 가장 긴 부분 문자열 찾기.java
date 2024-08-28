import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = 0;
        
        StringBuilder sb = new StringBuilder(myString);
        StringBuilder sb2 = new StringBuilder(pat);
   
        sb.reverse();
        sb2.reverse();

        index = sb.indexOf(sb2.toString());

        if(index != 0) sb.delete(0,index);
   
        answer = sb.reverse().toString();

        return answer;
    }
}