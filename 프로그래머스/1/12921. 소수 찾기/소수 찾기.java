class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] index = new int[n + 1];
        
        for(int i = 2; i <= n; i++){
            if(index[i] == 0){
                // i * i 가 한계치를 넘어 -2146737495 음수 방지 
                if((long) i * i > n) break;
                for(int j = i * i; j <= n; j += i){
                    index[j] = 1;
                }
            }
        }
        
        for(int k = 2; k <= n; k++){
            if(index[k] == 0) answer++;
        }
        
        return answer;
    }
}