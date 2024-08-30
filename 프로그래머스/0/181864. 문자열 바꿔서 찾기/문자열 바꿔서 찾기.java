class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.replaceAll("A","C");
        myString = myString.replaceAll("B","A");
        myString = myString.replaceAll("C","B");
        
        int answer = myString.indexOf(pat) != -1 ? 1 : 0;
        
        return answer;
    }
}