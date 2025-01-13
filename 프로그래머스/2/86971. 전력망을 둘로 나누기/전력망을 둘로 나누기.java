import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 100;

        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int l = 0; l < wires.length; l++){
            int n1 = wires[l][0];
            int n2 = wires[l][1];
            graph[n1].add(n2);
            graph[n2].add(n1);
        }

        for(int j = 1; j < n + 1; j++){

            List<Integer> first = graph[j];

            for(int second : first){
                int grid1 = bfs(first, graph[second], graph, j, second, n);
                int grid2 = bfs(graph[second], first, graph, second, j, n);

                answer = Math.min(answer, Math.abs(grid1 - grid2));
            }

        }

        return answer;
    }

    public static int bfs(List<Integer> parent1, List<Integer> parent2, List<Integer>[] graph, int p1, int p2, int n){

        boolean[] visited = new boolean[n + 1];

        visited[p1] = true;
        visited[p2] = true;

        Queue<List<Integer>> Q = new LinkedList<>();

        Q.offer(parent1);

        int count = 0;

        while(!Q.isEmpty()){
            List<Integer> now = Q.poll();

            for(int next : now){
                if(visited[next]) continue;
                visited[next] = true;
                Q.offer(graph[next]);
            }

            count++;
        }

        return count;
    }
    
}