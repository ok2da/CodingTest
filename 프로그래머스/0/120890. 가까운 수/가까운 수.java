class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) < Math.abs(answer - n)) {
                answer = array[i];
            }else if(Math.abs(array[i] - n) == Math.abs(answer - n)){
                answer = array[i] < answer ? array[i] : answer;
            }
        }
        
        return answer;
    }
}