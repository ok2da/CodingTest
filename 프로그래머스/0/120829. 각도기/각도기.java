class Solution {
    public int solution(int angle) {
        int answer = 1;
        
        if(angle >= 180) return answer = 4;
        if(angle > 90) return answer = 3;
        if(angle == 90) return answer = 2;        
        
        return answer;
    }
}