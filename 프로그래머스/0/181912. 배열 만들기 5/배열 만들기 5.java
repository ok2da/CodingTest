import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        for(int i = 0; i < intStrs.length; i++){
            String temp = intStrs[i].substring(s);
            if(temp.length() > l) temp = temp.substring(0,l);
            if(Integer.parseInt(temp) > k) list.add(Integer.parseInt(temp));
        }
        
        answer = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
        	answer[j] = list.get(j);
        }
        
        return answer;
    }
}