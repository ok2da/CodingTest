import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        
        Arrays.sort(numlist);
        
        int num = Integer.MAX_VALUE;
        int middle = 0;
        int right = 1;
        int left = 1;
        int right_num = 0;
        int left_num = 0;
        
        for(int i = 0; i < len; i++) {
            int ns = numlist[i];
            if(Math.abs(ns - n) <= Math.abs(num - n)) {
                num = numlist[i];
                middle = i;
            }
        }
        
        answer[0] = num;
        
        for(int j = 1; j < len; j++){
            right_num = Integer.MAX_VALUE;
            left_num = Integer.MAX_VALUE;
            
            if(middle + right != len){
                right_num = Math.abs(numlist[middle + right] - n);
            }
            if(middle - left != -1){
                left_num = Math.abs(numlist[middle - left] - n);
            }
            
            if(right_num <= left_num){
                answer[j] = numlist[middle + right];
                right++;
            }else {
                answer[j] = numlist[middle - left];
                left++;
            }
            
        }

        return answer;
    }
}