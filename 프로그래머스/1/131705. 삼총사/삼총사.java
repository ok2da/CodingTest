import java.util.*;
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < number.length; i++){
            list.add(number[i]);
        }
        
        for(int j = 0; j < list.size(); j++){
            for(int k = j + 1; k < list.size(); k++){
                for(int l = k + 1; l < list.size(); l++){
                    if(list.get(j) + list.get(k) + list.get(l) == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}