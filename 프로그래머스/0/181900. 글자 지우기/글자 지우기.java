import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
    
        StringBuilder sb = new StringBuilder(my_string);
        
        Arrays.sort(indices);
        
        for(int i = 0; i < indices.length; i++){
        	int index = indices[i];
        	sb.deleteCharAt(index-i);        		
        }
        
        answer = sb.toString();
        
        return answer;
    }
}