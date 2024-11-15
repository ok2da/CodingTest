import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int minus = 0;
        int len = nums.length;
        
        //set 대체 가능
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < len; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                answer++;
            }
        }
        
        answer = Math.min(answer, len / 2);
        
        return answer;
    }
}