class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;
        
        for(int i = 0; i < myString.length(); i++){
            char c_str = myString.charAt(i);
            char c_pat = pat.charAt(index);
            
            if(c_str > 90) c_str = (char) (c_str - ' ');
            if(c_pat > 90) c_pat = (char) (c_pat - ' ');
            
            if(c_str == c_pat) index++;
            if(index > 0 && c_str != c_pat) index = 0;
            if(index == pat.length()) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}