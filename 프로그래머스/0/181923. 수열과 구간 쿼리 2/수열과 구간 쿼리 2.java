class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
           
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int result = Integer.MAX_VALUE;
            boolean check = true;
            
            for(int j = s; j <= e; j++){
                int n = arr[j];
                if(n > k){
                    result = result > n ? n : result;
                    check = false;
                }
            }
            
            if(check) result = -1;
            
            answer[i] = result;
        }

        return answer;
    }
}