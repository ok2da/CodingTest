class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        
        while(n > num){
            answer++;
            num *= answer;
        }
        
        answer = n == num ? answer : answer - 1;
        
        return answer;
    }
    
}