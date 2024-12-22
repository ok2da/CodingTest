import java.util.*;
class Solution {
    public int solution(int[] order) {
        // order = [i] 번째 상자를 넣을 순서
        int answer = 0;
        int index = 0;
        int size = order.length;

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1; i <= size; i++){
            boolean check = false;
            if(i == order[index]){
                answer++;
                index++;
                check = true;
            }
            
            while(!stack.isEmpty()){
                if(stack.peek() == order[index]){
                    answer++;
                    index++;
                    stack.pop();
                }else {
                    break;
                }
            }
            
            if(!check) stack.push(i);
        }
        
        return answer;
    }
}