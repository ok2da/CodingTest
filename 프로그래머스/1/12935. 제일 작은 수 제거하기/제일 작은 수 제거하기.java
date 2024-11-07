import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = Integer.MAX_VALUE;
        int count = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(min >= arr[i]) {
                if(min > arr[i]) count = 0;
                min = arr[i];
                count++;
            }
        }
        
        if(arr.length != 1){
            answer = new int[arr.length - count];
            for(int j = 0; j < arr.length; j++){
                if(min != arr[j]) {
                    answer[index] = arr[j];
                    index++;
                }
            }
        }else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}