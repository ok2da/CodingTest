class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String zzac ="";
        int max = 0;
        int max2 = 0;
        for(int num : num_list){
            if(num%2 == 0){
                zzac += Integer.toString(num);
            }else{
                hol += Integer.toString(num);
            }
        }
        max = Integer.parseInt(zzac);
        max2 = Integer.parseInt(hol);
        answer = max+max2;
        return answer;
    }
}