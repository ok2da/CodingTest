class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s = 0;
        int e = 0;
        int k = 0;
    
        for(int l = 0; l < queries.length; l++){
            s = queries[l][0];
            e = queries[l][1];
            k = queries[l][2];
            for(int j = s; j <= e; j++){    
                if(j%k == 0 || j == 0) arr[j]++;
            }
        }

        return arr;
    }
}