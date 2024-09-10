class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            String str = "" + array[i];
            
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(c == 55) answer++;
            }
        }
        
        return answer;
    }
}