import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            index = arr[i].length < arr.length ? arr.length : arr[i].length; 
        }
        
        answer = new int[index][index];
        
        for(int j = 0; j < arr.length; j++){
            for(int k = 0; k < arr[j].length; k++){
                answer[j][k] = arr[j][k];
            }
        }
        
        return answer;
    }
}