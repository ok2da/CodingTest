import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] abc = new int[26];
        int len = s.length();

        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            
            if(c == '-') continue;
            if(abc[c - 97] > 0) s = s.replaceAll("" + c, "-");
            abc[c - 97]++;
        }
        
        s = s.replaceAll("-","");
        
        char[] sort = s.toCharArray();
        Arrays.sort(sort);
        
        answer = new String(sort);
        
        return answer;
    }
}