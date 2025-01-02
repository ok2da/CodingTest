class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        int index = 0;
        
        // index / n = 행, index % n = 열
        // (0,0) (0,1) (0,2)            
        // (1,0) (1,1) (1,2)    ->  각 요소에서 최대값 + 1 = 조건에 맞는 값
        // (2,0) (2,1) (2,2)            

        for(long i = left; i <= right; i++){
            long max = Math.max(i / n, i % n);
            answer[index] = (int) max + 1;
            index++;
        }
        
        return answer;
    }
}