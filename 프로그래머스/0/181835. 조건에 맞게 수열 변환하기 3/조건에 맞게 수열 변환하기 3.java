import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        boolean odd = k % 2 != 0 ? true : false;
        
        for(int i = 0; i < arr.length; i++) answer[i] = odd ? arr[i] * k : arr[i] + k;
        
        return answer;
    }
}