class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        
        numer1 = denom1 != lcm ? (lcm / denom1) * numer1 : numer1;
        numer2 = denom2 != lcm ? (lcm / denom2) * numer2 : numer2;
        
        answer[0] = numer1 + numer2;
        answer[1] = lcm;
        
        int lcm2 = gcd(answer[0], answer[1]);
        
        answer[0] /= lcm2;
        answer[1] /= lcm2;

        return answer;
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}