class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();

        if(len == 4 || len == 6){
            for(int i = 0; i < len; i++) {
                if(s.charAt(i) > 57) return answer;
            }
            answer = true;
        }else {
            return answer;
        }

        
        return answer;
    }
}