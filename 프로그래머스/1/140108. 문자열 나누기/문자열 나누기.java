import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;

        char[] c = s.toCharArray();
        char x = 0;
        int x_count = 0;
        int s_count = 0;
        
        for(int i = 0; i < c.length; i++){
            if(x_count == 0) x = c[i];
            
            if(x == c[i]) {
                x_count++;
            }else {
                s_count++;
            }
            
            if(x_count == s_count){
                answer++;
                x_count = 0;
                s_count = 0;
            }else if(i == c.length - 1){
                answer++;
            }
        }
        
        return answer;
    }
}