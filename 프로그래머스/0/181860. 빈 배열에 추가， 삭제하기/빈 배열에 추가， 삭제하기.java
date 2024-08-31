import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int len = flag[i] ? num * 2 : num;
            for(int j = 0; j < len; j++){
                if(flag[i]) {
                    stack.push(num);
                }else {
                    stack.pop();
                }
            }
        }
        
        answer = new int[stack.size()];
        
        for(int k = answer.length - 1; k >= 0; k--) answer[k] = stack.pop();
        
        
        return answer;
    }
}