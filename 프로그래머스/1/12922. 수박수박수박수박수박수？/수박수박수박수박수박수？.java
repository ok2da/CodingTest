import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        
        answer = sb.toString();
        
        return answer;
    }
}