import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int n = sequence.length;
        int left = 0;
        int right = 0;
        int d = n+1;
        int s = sequence[0];
        while (left <= right && right < n){
            if(s < k){
                right++;
                if (right == n){
                    break;
                }
                s += sequence[right];
            }else if(s > k) {
                s -= sequence[left];
                left++;
            }else {
                if (d > right - left + 1){
                    d = right - left + 1;
                    answer[0] = left;
                    answer[1] = right;
                }
                s -= sequence[left];
                left++;
            }
        }
        
        
        return answer;
    }
}