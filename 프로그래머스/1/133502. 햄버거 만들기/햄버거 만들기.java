import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            int hegiht = stack.size();
            if(ingredient[i] == 1 && hegiht >= 4){
                if(stack.get(hegiht - 1) == 1 && stack.get(hegiht - 2) == 3 && stack.get(hegiht - 3) == 2 && stack.get(hegiht - 4) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}