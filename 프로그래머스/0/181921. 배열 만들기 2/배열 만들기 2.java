import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
		
        boolean check = false;
        
        for(int i = l; i <= r; i++){
        	int temp_num = 0;
        	int result_num = 0;
        	String temp_str = "";
        	
        	
            if(i%5 == 0) {
                check = true;
                
                temp_num = i/10;
                temp_str += temp_num;
                
                for(int j = 0; j < temp_str.length(); j++) {
                	char c = temp_str.charAt(j);
                	if(c == '5' || c == '0') {
                		result_num++;
                	}
                }
            }
            
            if(result_num == temp_str.length() && temp_str.length() != 0) list.add(i);

            if(check) {
                i += 4;
            }
        }
        
        if(list.size() != 0) {
            answer = new int[list.size()];
            
            for(int k = 0; k < list.size(); k++) {
            	answer[k] = list.get(k);
            }
        }else {
        	answer = new int[1];
        	answer[0] = -1;
        }
        
        return answer;
    }
}