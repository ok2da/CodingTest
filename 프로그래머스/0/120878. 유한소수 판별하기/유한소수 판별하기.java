class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int g = gcd(a, b);
        
        a /= g;
        b /= g;
        
        answer = fc(a, b);
        
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static int fc(int a, int b){
        while(b % 2 == 0 || b % 5 == 0){
            if(b % 2 == 0) b /= 2;
            if(b % 5 == 0) b /= 5;
        }
        return a % b == 0 ? 1 : 2;
    } 
}