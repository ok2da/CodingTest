class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count = 0;
        int y_count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'P' || c == 'p') {
                p_count++;
                continue;
            }    
            if(c == 'Y' || c == 'y') {
                y_count++;
                continue;
            } 
        }
        
        if(p_count != y_count) answer = false;

        return answer;
    }
}