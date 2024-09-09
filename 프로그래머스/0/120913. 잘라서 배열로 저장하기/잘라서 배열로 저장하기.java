class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() / n + (my_str.length() % n != 0 ? 1 : 0);
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++) {
            int index = my_str.length() >= n ? n : my_str.length();
            answer[i] = my_str.substring(0,index);
            my_str = my_str.substring(index);
        }
        
        return answer;
    }
}