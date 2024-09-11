import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        
        Collections.sort(list);
        
        answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}