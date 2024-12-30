class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int a = 0;
        for(int i=0; i<num_list.length; i++){
            answer[i] += num_list[i];
            a++;
        }
        if(num_list[a-1] > num_list[a-2]){
            answer[a] = num_list[a-1] - num_list[a-2];
        }else{
            answer[a] = num_list[a-1]*2;
        }
        return answer;
    }
}