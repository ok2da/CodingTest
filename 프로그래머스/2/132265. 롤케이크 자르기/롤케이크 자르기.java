import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        int[] p1 = new int[10001];
        int[] p2 = new int[10001];
        int len = topping.length;

        int p1_cnt = 0;
        int p2_cnt = 0;

        for(int i = 0; i < len; i++){
            if(p1[topping[i]] == 0) p1_cnt++;
            p1[topping[i]]++;
        }

        for(int j = len - 1; j >= 0; j--){
            if(p1_cnt == p2_cnt) {
                answer++;
            }else if(p1_cnt < p2_cnt){
                break;
            }
            if(p2[topping[j]] == 0) p2_cnt++;
            p2[topping[j]]++;

            p1[topping[j]]--;
            if(p1[topping[j]] == 0) p1_cnt--;
        }
        
        return answer;
    }
}