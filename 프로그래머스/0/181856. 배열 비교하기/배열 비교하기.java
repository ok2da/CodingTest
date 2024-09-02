import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length == arr2.length) {
            int arr1_sum = Arrays.stream(arr1).sum();
            int arr2_sum = Arrays.stream(arr2).sum();

            answer = arr1_sum == arr2_sum ? 0 : arr1_sum < arr2_sum ? -1 : 1; 
        }else {
            answer = arr1.length < arr2.length ? -1 : 1;
        }
        
        
        return answer;
    }
}