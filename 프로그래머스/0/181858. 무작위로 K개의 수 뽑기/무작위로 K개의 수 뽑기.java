import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int a : arr) {
            if(!stack.contains(a)) stack.push(a);
            if(stack.size() == k) break;
        }
        
        while(stack.size() < k) stack.push(-1);
        
        for(int j = answer.length - 1; j >= 0; j--) answer[j] = stack.pop();
        
        return answer;
    }
}