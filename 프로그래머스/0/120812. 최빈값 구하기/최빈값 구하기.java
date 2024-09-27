class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1001];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) count[array[i]]++;
        
        for(int j = 0; j < count.length; j++) {
            if(count[j] > max) {
                max = count[j];
                answer = j;
            }else if(count[j] == max){
                answer = -1;
            }
        }

        return answer;
    }
}