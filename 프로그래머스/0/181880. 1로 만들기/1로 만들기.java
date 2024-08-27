class Solution {
    static int count = 0;
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){
            count = 0;
            answer += calculate(num_list[i]);    
        }
        
        return answer;
    }
    
    public int calculate(int num){
        if(num == 1) {
            return count;
        }else if(num % 2 == 0){
            count++;
            return calculate(num / 2);
        }else {
            count++;
            return calculate((num - 1) / 2);    
        }
    }
}