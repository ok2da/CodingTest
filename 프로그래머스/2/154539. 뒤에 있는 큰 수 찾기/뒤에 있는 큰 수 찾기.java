import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < len; i++){
            
            // 스택이 비어있지 않을때, 스택에 있는 요소(인덱스)를 사용해서 이전 숫자가 다음 숫자보다 작을때
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i]; // 인덱스를 추출하여 큰 수를 삽입
            }
            // 다음 수를 위해 인덱스 삽입
            stack.push(i);
        }
        
        // 순회가 끝나고, 남은 요소들은 모두 다음의 수들이 큰 수가 없으므로 -1 삽입
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        
        return answer;
    }
}