class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        
        for(int i = 0; i < len; i++){
            if(len - i <= 4){
                answer += phone_number.charAt(i);
            }else {
                answer += "*";
            }
        }
        
        return answer;
    }
}