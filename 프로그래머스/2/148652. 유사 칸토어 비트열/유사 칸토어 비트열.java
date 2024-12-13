class Solution {
    
    static int bit;
    
    public int solution(int n, long l, long r) {
        int answer = 0;
        
        for(l--; l < r; l++){
            result(l);
        }
        
        answer = bit;
        
        return answer;
    }
    
    public static void result(long l) {

        if(l < 5 && l != 2){
            bit++;
        }else if(l % 5 != 2){
            result(l / 5);
        }

    }
}