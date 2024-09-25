import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        BigInteger operation;
        
        operation = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
        
        answer = operation.intValue();
        
        return answer;
    }
    
    public BigInteger factorial(int n){
        BigInteger temp = BigInteger.valueOf(1);
        
        for(int i = 1; i <= n; i++){
            temp = temp.multiply(BigInteger.valueOf(i));
        }
        
        return temp;
    }
}