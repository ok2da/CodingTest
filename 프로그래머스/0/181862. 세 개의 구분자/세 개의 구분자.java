class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        
        myStr = myStr.replaceAll("a|b|c"," ").trim();
        
        answer = myStr.equals("") ? answer : myStr.split("\\s+");
        
        return answer;
    }
}