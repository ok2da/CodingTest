class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            answer += c >= 97 ? "" + (char) (c - 32) : "" + (char) (c + 32);
        }
        
        return answer;
    }
}