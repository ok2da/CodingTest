class Solution {
    public int solution(int a, int b) {
        int answer;
        String s = String.valueOf(a) + String.valueOf(b);
        int i = Integer.valueOf(s);
        if(i >= (2*a*b)){
            answer = i;
        }else{
            answer = (2*a*b);
        }
        return answer;
    }
}