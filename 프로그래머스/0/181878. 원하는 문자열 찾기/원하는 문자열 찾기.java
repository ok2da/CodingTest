class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        if(myString.toUpperCase().indexOf(pat.toUpperCase()) != -1) answer = 1;
        
        return answer;
    }
}