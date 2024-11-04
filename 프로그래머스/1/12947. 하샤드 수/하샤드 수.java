class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int n = x;
        
        while(n != 0){
            num += n % 10;
            n /= 10;
        }
        
        answer = x % num == 0 ? true : false;
        
        return answer;
    }
}