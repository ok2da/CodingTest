class Solution {
    
    public int solution(int storey) {
        int answer = calculate(storey);

        return answer;
    }
    
    public static int calculate(int floor){
        int count = 0;

        while(floor != 0){
            // 자리수 추출
            int n = floor % 10;

            if(n < 5){
                count += n;
                floor = floor / 10;
            }else if(n == 5){
                int nn = floor / 10;
                if(nn % 10 >= 5){
                    count += 10 - n;
                    floor = floor / 10 + 1;
                }else {
                    count += n;
                    floor = floor / 10;
                }
            }else {
                count += 10 - n;
                floor = floor / 10 + 1;
            }


        }

        return count;
    }
}