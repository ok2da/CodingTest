class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(c >= 48 && c <= 57) {
                str += c;
            }else if(!str.equals("")){
                answer += Integer.parseInt(str);
                str = "";
            }else {
                str = "";
            }
            
        }
        
        if(!str.equals("")) answer += Integer.parseInt(str);
        
        return answer;
    }
}