class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && b == c && c == a) {
           return  answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        }else if((a == b && a != c) || (a == c && a != b) || (b == c && a != b)){
           return  answer = (a + b + c) * (a * a + b * b + c * c);
        }else{
           return answer = a + b + c;
        }
        
    }
}