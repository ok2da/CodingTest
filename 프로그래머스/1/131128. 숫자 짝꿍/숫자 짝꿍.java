import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] count = new int[10];
        int[] result = new int[10];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < X.length(); i++){
            int x = X.charAt(i) - 48;
            count[x]++;
        }

        for(int j = 0; j < Y.length(); j++){
            int y = Y.charAt(j) - 48;

            if(count[y] != 0) {
                count[y]--;
                result[y]++;
            }
        }

        for(int k = result.length - 1; k >= 0; k--){
            if(result[k] == 0) continue;
            for(int l = 0; l < result[k]; l++){
                sb.append(k);
            }
        }

        if(sb.length() == 0){
            answer = "-1";
        }else if(sb.charAt(0) == '0'){
            answer = "0";
        }else {
            answer = sb.toString();
        }

        return answer;
    }
}