class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        

        boolean check = s1.length > s2.length ? true : false;
        
        for(int i = 0; i < (check ? s1.length : s2.length); i++){
            for(int j = 0; j < (check ? s2.length : s1.length); j++){
                if(check){
                    answer += s1[i].equals(s2[j]) ? 1 : 0;
                }else {
                    answer += s2[i].equals(s1[j]) ? 1 : 0;
                }   
            }
        }

        
        return answer;
    }
}