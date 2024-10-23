import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Arrays.sort(numbers);
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }
        }
        
        answer = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}