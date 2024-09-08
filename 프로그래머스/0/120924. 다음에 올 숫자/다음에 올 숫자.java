class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int n = common.length;
        
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[n-1] + (common[n-1] - common[n-2]);
        }else {
            answer = common[n-1] * (common[n-1] / common[n-2]);
        }
        
        return answer;
    }
}