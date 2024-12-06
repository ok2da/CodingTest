import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<int[]> Q = new LinkedList<>();
        
        // BFS를 위한 방문을 확인할 boolean 배열
        boolean[] visited = new boolean[y + 1];

        // 자연수, 연산횟수
        Q.offer(new int[]{x, 0});

        while(!Q.isEmpty()){
            int[] arr = Q.poll();
            int number = arr[0];
            int result = arr[1];

            // 자연수가 y와 동일한 경우 연산횟수를 반환함
            if(number == y) {
                return answer = result;
            }

            // +n , *2 , *3 연산을 했을 때 y보다 작을경우 && 탐색한 범위가 아닐경우 큐에 삽입
            if(number + n <= y && !visited[number + n]) {
                visited[number + n] = true;
                Q.offer(new int[]{number + n, result + 1});
            }

            if(number * 2 <= y && !visited[number * 2]) {
                visited[number * 2] = true;
                Q.offer(new int[]{number * 2, result + 1});
            }
            
            if(number * 3 <= y && !visited[number * 3]) {
                visited[number * 3] = true;
                Q.offer(new int[]{number * 3, result + 1});
            }
        }

        return answer = -1;
    }
}