class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 페인트 덧칠한 범위
        int paint = 0;
        
        for(int i = 0; i < section.length; i++){
            //덧칠한 범위보다 큰경우 덧칠한 범위를 다시 정하고 칠한 횟수를 증가
            if(paint <= section[i]){
                paint = section[i] + m;
                answer++;
            }
        }
        
        return answer;
    }
}