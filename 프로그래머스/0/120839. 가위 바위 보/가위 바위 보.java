class Solution {
    public String solution(String rsp) {
        String answer = "";
        rsp = rsp.replaceAll("2","s").replaceAll("0","r").replaceAll("5","p");
        answer = rsp.replaceAll("s","0").replaceAll("r","5").replaceAll("p","2");
        return answer;
    }
}