import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> memory = new HashMap<>();
        
        for(int i = 0; i < yearning.length; i++){
            memory.put(name[i], yearning[i]);
        }
        
        for(int j = 0; j < photo.length; j++){
            for(int k = 0; k < photo[j].length; k++){
                if(memory.containsKey(photo[j][k])){
                    int score = memory.get(photo[j][k]);
                    answer[j] += score;
                }
            }
        }
        
        return answer;
    }
}