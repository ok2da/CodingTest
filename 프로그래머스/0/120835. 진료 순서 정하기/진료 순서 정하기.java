import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] rank = emergency.clone();
        
        Arrays.sort(rank);
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < rank.length; j++){
                if(emergency[i] == rank[j]) answer[i] = rank.length - j;
            }
        }
        
        return answer;
    }
}