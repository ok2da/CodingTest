class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] arr = new int[31];
        
        for(int i = 0; i < strArr.length; i++){
            int len = strArr[i].length();
            answer = answer < ++arr[len] ? arr[len] : answer;
        }
        
        return answer;
    }
}