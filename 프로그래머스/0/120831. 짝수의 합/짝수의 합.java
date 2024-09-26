class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i <= n; i++){
            if(i != 0) answer += i % 2 == 0 ? i : 0;
        }
        
        return answer;
    }
}