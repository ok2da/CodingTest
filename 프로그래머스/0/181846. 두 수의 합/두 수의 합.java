import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger bigint_a = new BigInteger(a);
        BigInteger bigint_b = new BigInteger(b);
        BigInteger sum = bigint_a.add(bigint_b);
       
        String answer = sum.toString();
        
        return answer;
    }
}