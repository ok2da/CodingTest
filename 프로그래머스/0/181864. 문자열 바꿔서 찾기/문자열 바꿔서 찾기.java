class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.replace("A","a").replace("B","A").replace("a","B");
        
        int answer = myString.indexOf(pat) != -1 ? 1 : 0;
        
        return answer;
    }
}