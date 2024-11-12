class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        int len = c.length;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(c[j] < c[j + 1]){
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        
        for(char cc : c){
            sb.append(cc);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}