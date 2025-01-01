class Solution {
    
    static int maxEntryCount = 0;
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        boolean[] visit = new boolean[dungeons.length];

        dfs(k, dungeons, visit, 0);

        answer = maxEntryCount;

        return answer;
    }
    
    public static void dfs(int k, int[][] dungeons, boolean[] visit, int count){

        maxEntryCount = count > maxEntryCount ? count : maxEntryCount;

        for(int i = 0; i < dungeons.length; i++){
            if(!visit[i] && dungeons[i][0] <= k){
                visit[i] = true;
                dfs(k - dungeons[i][1], dungeons, visit, count + 1);
                visit[i] = false;
            }
        }
    }
}