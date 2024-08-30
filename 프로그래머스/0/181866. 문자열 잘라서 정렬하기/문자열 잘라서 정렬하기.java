import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String str = "";
        boolean check = false;
     
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            
            if(c != 'x'){
                str += c;
                check = false;
            }else if(i != 0 && c == 'x' && !check){
                str += " ";
                check = true;
            }
        }
        
        answer = str.split(" ");
        
        Arrays.sort(answer);
        
        return answer;
    }
}