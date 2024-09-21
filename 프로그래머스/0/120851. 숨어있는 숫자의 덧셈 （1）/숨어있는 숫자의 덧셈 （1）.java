class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] str = my_string.replaceAll("[A-Za-z]","").split("");
        
        for(int i = 0; i < str.length; i++) answer += Integer.parseInt(str[i]);

        return answer;
    }
}