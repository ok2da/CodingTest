import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;

        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        for(int i = 0; i < enemy.length; i++){

            PQ.offer(enemy[i]);

            if(PQ.size() > k){
                int e = PQ.poll();
                if(e > n) {
                    answer = i;
                    break;
                }
                n -= e;
            }
        }
        
        return answer;
    }
}