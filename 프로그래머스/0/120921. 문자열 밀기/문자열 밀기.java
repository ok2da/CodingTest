class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        int len = A.length();

        if(A.equals(B)) return answer = 0;

        for(int i = 1; i <= A.length(); i++){
            if(A.equals(B)) return answer = i-1;
            
            A = A.substring(len - 1) + A.substring(0, len-1);
 
        }
        
        return answer = -1;
    }
}