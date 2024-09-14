class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = -1;

        while(chicken > 9){
            coupon = chicken / 10;
            
            answer += coupon;
            
            coupon += chicken % 10;
            
            chicken = coupon;
        }

        return answer;
    }
}