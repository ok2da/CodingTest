import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int start = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 1) {
                Arrays.fill(answer, start, start + arr[i], arr[i]);
            }else {
                answer[start] = arr[i];
            }
            start += arr[i];
        }
        
        return answer;
    }
}