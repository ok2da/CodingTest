class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = 6;
        
        while(pizza % n != 0){
            pizza += 6;
            answer++;
        }
        
        return answer;
    }
}