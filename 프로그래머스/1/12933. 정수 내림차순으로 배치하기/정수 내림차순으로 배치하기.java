import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = n;
        
        int count = 0;
        long[] index = new long[10];
        
        for(int i = 0; i < 10; i++){
            if(num != 0){
                index[i] = num % 10;
                num /= 10;
                count += 1;
            }else{
                break;
            }
        }

        Arrays.sort(index);
        
        for(int k = 9; k > 9 - count; k--){
            answer = answer * 10 + index[k];
        }
        
        return answer;
    }
}