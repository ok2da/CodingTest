import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);

        int min = 10;
        int index = 0;

        for(int i = score.length - 1; i >= 0; i--) {
            min = min > score[i] ? score[i] : min;
            index++;
            
            if(index == m){
                index = 0;
                answer += min * m;
                min = 10;
            }
        }
        
        return answer;
    }
}