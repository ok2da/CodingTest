import java.util.*;
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        Stack<Integer> D = new Stack<>();
        Stack<Integer> P = new Stack<>();

        for(int i = 0; i < n; i++){
            D.push(deliveries[i]);
            P.push(pickups[i]);
        }


        while(!D.isEmpty() || !P.isEmpty()){
            // 배달 제한 수량, 회수 제한 수량
            int D_limit = 0;
            int P_limit = 0;

            // D, P가 0일때 버림
            while(!D.isEmpty() && D.peek() == 0) D.pop();
            while(!P.isEmpty() && P.peek() == 0) P.pop();

            // 왕복 거리를 미리 계산
            answer += Math.max(D.size(), P.size()) * 2;

            while(!D.isEmpty()){
                int deliverie = D.pop();

                // 배달할 개수와 현재 탑재 수량과 더했을때 같거나 작을때 제한 수량에 더함
                if(deliverie + D_limit <= cap){
                    D_limit += deliverie;
                }else {
                    // 배달할 개수에서 배달 가능한 개수를 제외한 나머지를 스택에 삽입
                    D.push(deliverie - (cap - D_limit));
                    break;
                }
            }

            while(!P.isEmpty()){
                int pickup = P.pop();

                if(pickup + P_limit <= cap){
                    P_limit += pickup;
                }else {
                    P.push(pickup - (cap - P_limit));
                    break;
                }
            }
        }
        
        return answer;
    }
}