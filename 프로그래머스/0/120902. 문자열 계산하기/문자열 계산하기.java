class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] temp = my_string.split(" ");
        boolean minus = false;
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals("-")){
                minus = true;
                continue;
            }else if(temp[i].equals("+")){
                minus = false;
                continue;
            }
                
            if(!minus){
                answer += Integer.parseInt(temp[i]);
            }else {
                answer -= Integer.parseInt(temp[i]);
            }
            
        }
        
        return answer;
    }
}