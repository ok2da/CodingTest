class Solution {
    public int solution(int a, int b, int n) {
        // 주어진 빈병 n, 빈병 a개를 가져다주면 콜라 b개를 받음
        
        int answer = 0;
        
        while(n >= a){
            answer += (n / a) * b;
            n = ((n / a) * b) + (n % a);
        }
        
        return answer;
    }

}