class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");
            
            int X = Integer.parseInt(str[0]);
            String oper = str[1];
            int Y = Integer.parseInt(str[2]);
            int Z = Integer.parseInt(str[4]);
            
            if(oper.equals("+")){
                answer[i] = X + Y == Z ? "O" : "X";
            }else {
                answer[i] = X - Y == Z ? "O" : "X";
            }
        }
        
        return answer;
    }
}