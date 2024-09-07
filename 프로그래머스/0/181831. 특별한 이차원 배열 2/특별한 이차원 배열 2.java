class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(arr[i][j] != arr[j][i]) return answer;
            }
        }
        
        return answer = 1;
    }
}