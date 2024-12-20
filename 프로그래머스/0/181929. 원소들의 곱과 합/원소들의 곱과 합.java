class Solution {
    public int solution(int[] num_list) {
        //int answer = 0;
        int a = 1;
        int b = 0;

        for(int num : num_list){
            a *= num;
            b += num;
        }
        if(a < b*b) {
            return 1;
        }else{
            return 0;
        }
        //return answer;
    }
}