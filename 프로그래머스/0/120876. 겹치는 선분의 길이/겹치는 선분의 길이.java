class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] line = new int[201];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < lines.length; i++){
            int L1 = lines[i][0];
            int L2 = lines[i][1];
            boolean check = false;
            
            min = L1 < min ? L1 : min;
            max = L2 > max ? L2 : max;
            
            while(L1 <= L2){
                if(check)line[L1 + 100]++;
                if(!check) check = true;
                L1++;
            }
        }
        
        for(int j = min; j <= max; j++) if(line[j + 100] > 1) answer++; 
        
        return answer;
    }
}