class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] student = new int[n + 1];
        
        for(int i = 0; i < n; i++){
            if(lost.length - 1 >= i) student[lost[i]]--;
            if(reserve.length - 1 >= i) student[reserve[i]]++;

            if(lost.length - 1 < i && reserve.length - 1 < i) break;
        }
        
        for(int j = 1; j <= n; j++){
            
            // lost에 포함 안되는 학생
            if(student[j] >= 0){
                answer++;
                continue;
            }
            
            // student 요소 - 1 이전이 reserve에 해당 될 경우
            if(j > 0 && student[j - 1] > 0){
                student[j - 1]--;
                student[j]++;
                answer++;
                continue;
            }
            
            // student 요소 + 1 이후가 reserve에 해당 될 경우
            if(j < n && student[j + 1] > 0){
                student[j + 1]--;
                student[j]++;
                answer++;
                continue;
            }
            
        }
        
        return answer;
    }
}