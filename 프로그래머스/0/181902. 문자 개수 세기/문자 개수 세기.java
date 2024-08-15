class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c - 'a' > -1 ){
                answer[c-97+26]++;
            }else {
                answer[c-65]++;
            }
            
        }
        return answer;
    }
}