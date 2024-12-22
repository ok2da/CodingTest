import java.util.*;
class Solution {
    
    static int result;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        //0 = 합, 1 = 인덱스
        calculate(numbers, target, new int[] {0, 0});
        
        answer = result;
        
        return answer;
    }
    
    public void calculate(int[] arr, int target, int[] memory){
        if(memory[1] == arr.length) {
            if(memory[0] == target) result++;
            return;
        }
        
        // 더하고, 빼기
        calculate(arr, target, new int[] {memory[0] + arr[memory[1]], memory[1] + 1});
        calculate(arr, target, new int[] {memory[0] - arr[memory[1]], memory[1] + 1});
        
    }
    

}