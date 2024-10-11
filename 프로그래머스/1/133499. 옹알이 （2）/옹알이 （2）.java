import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];

            boolean aya = false;
            boolean ye = false;
            boolean woo = false;
            boolean ma = false;
            boolean check = false;
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                int index = 0;
                sb.append(c);

                if(sb.indexOf("aya") != -1){
                    if(aya) check = true;
                    index = sb.indexOf("aya");
                    sb.replace(index, index + 3, "-");
                    count++;
                    aya = true; ye = false; woo = false; ma = false;
                }else if(sb.indexOf("ye") != -1){
                    if(ye) check = true;
                    index = sb.indexOf("ye");
                    sb.replace(index, index + 2, "-");
                    count++;
                    aya = false; ye = true; woo = false; ma = false;
                }else if(sb.indexOf("woo") != -1){
                    if(woo) check = true;
                    index = sb.indexOf("woo");
                    sb.replace(index, index + 3, "-");
                    count++;
                    aya = false; ye = false; woo = true; ma = false;
                }else if(sb.indexOf("ma") != -1){
                    if(ma) check = true;
                    index = sb.indexOf("ma");
                    sb.replace(index, index + 2, "-");
                    count++;
                    aya = false; ye = false; woo = false; ma = true;
                }
                
                if(check) break;
            }

            if(!check && sb.length() == count) answer++;

            sb.setLength(0);
        }
        
        return answer;
    }
}