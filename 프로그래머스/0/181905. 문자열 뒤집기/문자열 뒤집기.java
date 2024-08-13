import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        if(s != e || e-s != 0) {
            String str1 = my_string.substring(0, s);
            String str2 = my_string.substring(s, e + 1);
            String str3 = my_string.substring(e + 1);
            StringBuilder st = new StringBuilder(str2);
            answer = str1 + st.reverse() + str3;            
        }else {
            return my_string;
        }

        return answer;
    }
}