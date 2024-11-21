class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String c = overwrite_string + my_string.substring(s + overwrite_string.length());
        String answer = my_string.substring(0,s) + c;
        return answer;
    }
}