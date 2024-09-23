import java.util.*;
class Solution {
        public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp = 0;
        
        if(direction.equals("right")){
            temp = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            answer[0] = temp;
        }else{
            temp = numbers[0];
            answer = Arrays.copyOfRange(numbers, 1, numbers.length + 1);
            answer[answer.length - 1] = temp;
        }
        
        return answer;
    }
}