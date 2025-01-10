class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(isOddOrEven(n)){
            answer = add(n);
        }else {
            answer = square(n);
        }
        
        return answer;
    }
    
    public boolean isOddOrEven(int n){
        if(n % 2 == 1) return true;
        return false;   
    }
    
    public int add(int odd){
        if(odd < 1) return 0;
        return odd + add(odd - 2);
    }
    
    public int square(int even){
        if(even < 2 || even % 2 != 0) return 0;
        return even * even + square(even - 2);
    }
}