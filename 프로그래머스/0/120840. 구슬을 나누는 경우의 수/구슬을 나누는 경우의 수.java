class Solution {
    public int solution(int balls, int share) {
        int answer = (int) oper(balls, share);

        return answer;
    }
    
    public long oper(int a, int b){
        int n = (a - b) > b ? b : a - b;
        
        if(n == 0) return 1;

        return oper(a - 1, n - 1) * a / n;
    }
}