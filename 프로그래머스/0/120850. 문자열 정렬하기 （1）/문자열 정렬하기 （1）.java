import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String[] str = my_string.replaceAll("[^0-9]","").split("");
        
        answer = new int[str.length];
        
        for(int i = 0; i < str.length; i++) answer[i] = Integer.parseInt(str[i]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}