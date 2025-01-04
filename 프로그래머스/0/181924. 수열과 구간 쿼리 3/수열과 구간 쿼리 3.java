class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        int temporary = 0;
        
        // ex) 01234 - 31204 - 32104 -  34102
        for(int i = 0; i < queries.length; i++){
            temporary = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temporary;
        }
        
        return answer;
    }
}