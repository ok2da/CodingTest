class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] n = new int[10];

        for(int i = 0; i < numbers.length; i++){
            n[numbers[i]]++;
        }

        for(int j = 0; j < 10; j++){
            if(n[j] == 0) answer += j;
        }
        
        
        return answer;
    }
}