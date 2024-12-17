import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = 0;
        
        int[] size = new int[10000001];

        for(int i = 0; i < tangerine.length; i++){
            int n = tangerine[i];
            size[n]++;
        }
        
        Arrays.sort(size);
        
        for(int j = 10000000; j >= 0; j--){
            count += size[j];
            answer++;

            if(count >= k) break;
        }

        return answer;
    }
}