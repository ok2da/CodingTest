import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        int a = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(age != 0){
            a = (age % 10) + 97;

            char c = (char) a;
            sb.append(c);
            age /= 10;
        }
        
        answer = sb.reverse().toString();
        
        return answer;
    }
}