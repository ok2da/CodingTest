import java.util.*;
class Solution {
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int count = 0;
        Map<String, Integer> m = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            m.put(want[i], number[i]);
            count++;
        }

        for(int j = 0; j < discount.length - count; j++) {
            Map<String, Integer> copy = new HashMap<>(m);
            for (int k = j; k < discount.length; k++) {
                String key = discount[k];
                if(copy.containsKey(key)){
                    int value = copy.get(key);
                    if(value - 1 == 0){
                        copy.remove(key);
                    }else {
                        copy.put(key, value - 1);
                    }
                }else {
                    break;
                }
            }
            if(copy.size() == 0) answer++;
        }

        
        return answer;
    }
}