import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey("" + c)){
                int index = i - map.get("" + c);
                map.put("" + c, i);
                answer[i] = index;
            }else {
                map.put("" + c, i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}