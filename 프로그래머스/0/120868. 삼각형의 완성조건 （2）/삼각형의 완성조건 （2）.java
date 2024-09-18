class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int a = Math.max(sides[0],sides[1]);
        int b = Math.min(sides[0],sides[1]);
        
        int m = a - b;
        int p = a + b;
        
        for(int i = m + 1; i < p; i++){
            int c = i;
            if(a + b > c && a + c > b && b + c > a) answer++;
        }
        

        
        return answer;
    }
}