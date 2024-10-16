class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int a = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
            int b = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];

            if(a > w){
                w = a;
            }
            if(b > h){
                h = b;
            }
        }
        
        answer = w * h;
        
        return answer;
    }
}