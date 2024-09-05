import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = new int[arr.length];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            int arr_num = arr[i];
            boolean check = false;
            for(int j = 0; j < delete_list.length; j++){
                int delete_num = delete_list[j];
                if(arr_num == delete_num) {
                    check = true;
                    break;
                }
            }
            if(!check) answer[index++] = arr_num;
        }
        
        answer = Arrays.copyOfRange(answer, 0, index);
        
        return answer;
    }
}