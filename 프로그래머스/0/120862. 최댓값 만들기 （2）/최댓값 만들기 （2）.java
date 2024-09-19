import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        // 가장 큰 음수가 인덱스 0, 1이 될 수 있음
        int a = numbers[0] * numbers[1];
        
        int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        answer = a < b ? b : a;
        
        return answer;
    }
}