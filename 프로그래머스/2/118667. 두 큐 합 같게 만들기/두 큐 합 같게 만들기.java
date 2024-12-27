import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int count = 0;
        long q1_sum = 0;
        long q2_sum = 0;
        int max = (queue1.length + queue2.length) * 2;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int Q1 : queue1){
            q1.offer(Q1);
            q1_sum += Q1;
        }
        for(int Q2 : queue2){
            q2.offer(Q2);
            q2_sum += Q2;
        }

        if(q1_sum + q2_sum % 2 == 1) answer = -1;

        if(q1_sum != q2_sum) {
            while(!q1.isEmpty() && !q2.isEmpty()){
                int q1_n = q1.peek();
                int q2_n = q2.peek();
                
                if(count == max) {
                    count = -1;
                    break;
                }

                if(q1_sum > q2_sum){
                    q1_sum -= q1_n;
                    q2_sum += q1_n;
                    q2.offer(q1.poll());
                }else {
                    q1_sum += q2_n;
                    q2_sum -= q2_n;
                    q1.offer(q2.poll());
                }

                count++;

                if(q1_sum == q2_sum) break;
            }
            
            if(q1.size() == 0 || q2.size() == 0) count = -1;
        }

        answer = count;

        return answer;
    }
}