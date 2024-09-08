class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            String select = babbling[i];
            String temp = "";
            int count = 0;
            boolean check = false;
            
            boolean aya = false;
            boolean ye = false;
            boolean woo = false;
            boolean ma = false;
            
            for(int j = 0; j < select.length(); j++){
                char c = select.charAt(j);  
                temp += c;

                if(temp.equals("ye")){
                    check = true;
                    if(ye) break;
                    temp = temp.replace("ye","");
                    ye = true;
                }else if(temp.equals("ma")){
                    check = true;
                    if(ma) break;
                    temp = temp.replace("ma","");
                    ma = true;
                }else if(temp.equals("aya")){
                    check = true;
                    if(aya) break;
                    temp = temp.replace("aya","");
                    aya = true;
                }else if(temp.equals("woo")){
                    check = true;
                    if(woo) break;
                    temp = temp.replace("woo","");
                    woo = true;
                }

            }
            
            if(temp.equals("")) answer += check ? 1 : 0;
            
        }
        
        return answer;
    }
    
}