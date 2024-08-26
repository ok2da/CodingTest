import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int a : arr) list.add(a);
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = s; j <= e; j++){
                list.set(j, list.get(j) + 1);
            }
        }
        
        answer = new int[list.size()];
        
        for(int k = 0; k < answer.length; k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}