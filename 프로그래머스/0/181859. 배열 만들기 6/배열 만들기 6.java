import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else if(stack.peek() == arr[i]){
                stack.pop();
            }else {
                stack.push(arr[i]);
            }
        }
        
        if(stack.isEmpty()) stack.push(-1);
        
        answer = new int[stack.size()];
        
        for(int j = answer.length - 1; j >= 0; j--) answer[j] = stack.pop();

        
        return answer;
    }
}