class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double a = Math.sqrt(n);
        long b = (long) a;
        
        if(a - b != 0){
            answer = -1;
        }else {
            answer = (b + 1) * (b + 1);
            //answer = (long) Math.pow(a+1, 2);
        }
        
        return answer;
    }
}