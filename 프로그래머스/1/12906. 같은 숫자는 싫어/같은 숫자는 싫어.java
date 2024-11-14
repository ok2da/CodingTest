import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(!list.isEmpty()){
                if(list.get(index) != arr[i]){
                    list.add(arr[i]);
                    index++;
                }
            }else {
                list.add(arr[i]);
            }
        }
        
        answer = new int[index + 1];
        
        for(int j = 0; j <= index; j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}