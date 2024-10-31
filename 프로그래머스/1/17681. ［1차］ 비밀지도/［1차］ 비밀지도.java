import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            while(arr1[i] + arr2[i] != 0){
                if(arr1[i] % 2 == 0 && arr2[i] % 2 == 0){
                    sb.append(" ");
                }else {
                    sb.append("#");
                }
                arr1[i] /= 2;
                arr2[i] /= 2;    
            }
            
            for(int j = sb.length(); j < n; j++){
                sb.append(" ");
            }
            
            answer[i] = sb.reverse().toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}