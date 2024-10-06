class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int min = 0;
        int max = p.length();
        int len = t.length();
        
        while(max <= len){
            Long num = Long.parseLong(t.substring(min, max));
            if(num <= Long.parseLong(p)) answer++;
            min++;
            max++;
        }
        
        return answer;
    }
}