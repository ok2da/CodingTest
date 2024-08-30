class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        
        myStr = myStr.replace("a"," ").replace("b"," ").replace("c"," ").trim();
        
        answer = myStr.equals("") ? answer : myStr.split("\\s+");
        
        return answer;
    }
}