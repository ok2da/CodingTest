import java.util.*;
class Solution {
    
    class Disk {
        int order;
        int time;

        Disk(int order, int time){
            this.order = order;
            this.time = time;
        }
    }
    
    public int solution(int[][] jobs) {
        int answer = 0;

        int currentTime = 0;

        int size = jobs.length;

        // 소요시간 우선순위 큐
        PriorityQueue<Disk> tQ = new PriorityQueue<>((o1, o2) -> o1.time - o2.time);
        // 작업 요청 시점 우선순위 큐
        PriorityQueue<Disk> oQ = new PriorityQueue<>((o1, o2) -> o1.order - o2.order);

        for(int i = 0; i < size; i++){
            oQ.offer(new Disk(jobs[i][0], jobs[i][1]));
        }

        while(!oQ.isEmpty() || !tQ.isEmpty()){

            while(!oQ.isEmpty() && oQ.peek().order <= currentTime){
                tQ.offer(oQ.poll());
            }
            
            if(!tQ.isEmpty()){
                Disk disk = tQ.poll();
                int order = disk.order;
                int time = disk.time;
                answer += currentTime - order + time;
                currentTime += time;
            }else {
                currentTime = oQ.peek().order;
            }


        }

        answer /= size;
        
        return answer;
    }
}