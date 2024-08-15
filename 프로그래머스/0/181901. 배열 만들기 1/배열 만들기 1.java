import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        int num = k;
        
        while(num <= n){
            list.add(num);
            num += k;
        }
        
        int[] answer = new int[list.size()];
        
        int count = 0;
        
        for(int value : list){
            answer[count] = value;
            count++;
        }
        
        
        return answer;
    }
}