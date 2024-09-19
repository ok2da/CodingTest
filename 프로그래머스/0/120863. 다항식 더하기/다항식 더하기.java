class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] str = polynomial.split(" ");
        
        int x = 0;
        int n = 0;
        
        for(int i = 0; i < str.length; i++){
            if(str[i].contains("x")) {
                if(str[i].equals("x")){
                    x += 1;
                }else{
                    x += Integer.parseInt(str[i].replaceAll("x",""));
                }
            }else if(!str[i].equals("+")){
                n += Integer.parseInt(str[i]);
            }
        }
        
        // x + 1 , 2x + 1 , x , 2x , 2
        if(x > 1) answer += String.valueOf(x);
        if(x > 0) answer += "x";
        if(x > 0 && n > 0) answer += " + ";
        if(n > 0) answer += String.valueOf(n);

        return answer;
    }
}