class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        for(int x = 0; x <= d; x += k){
            // d² = x² + y² -> y² = d² - x²
            int y = (int) Math.sqrt(Math.pow(d, 2) - Math.pow(x, 2));
            answer += (y / k) + 1;
        }
        
        return answer;
    }
}