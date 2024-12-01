class Solution {
    public int solution(String[] board) {
        int answer = 0;

        int[][] TTT = new int[3][3];
        int O = 0;
        int X = 0;

        for(int i = 0; i < 3; i++){
            char c1 = board[i].charAt(0);
            char c2 = board[i].charAt(1);
            char c3 = board[i].charAt(2);

            if(c1 == 'O') {
                O++;
                TTT[i][0] = 1;
            }else if(c1 == 'X'){
                X++;
                TTT[i][0] = -1;
            }
            if(c2 == 'O') {
                O++;
                TTT[i][1] = 1;
            }else if(c2 == 'X'){
                X++;
                TTT[i][1] = -1;
            }
            if(c3 == 'O') {
                O++;
                TTT[i][2] = 1;
            }else if(c3 == 'X'){
                X++;
                TTT[i][2] = -1;
            }
        }
        
        boolean O_win = tttw(TTT, 3);
        boolean X_win = tttw(TTT, -3);

        // O보다 X가 많은 경우 = O가 1개 더 많아야함
        if(O < X) return answer;
        // O가 개수가 더 많은경우 = O가 X보다 1개보다 많지 않아야함
        if(O - X > 1) return answer;
        // 둘 다 승리인 경우 = 하나만 승리여야 함
        if(O_win && X_win) return answer;
        // O가 승리인데, X가 더 많을 경우 = O가 1개 더 많아야함
        if(O_win && O <= X) return answer;
        // X가 승리인데, O가 더 많을 경우 = 갯수가 같아야함
        if(X_win && O != X) return answer;
        
        answer = 1;
        
        return answer;
    }
    
    public boolean tttw(int[][] TTT, int num){

        // 1,2,3 빙고 ㅡ
        if(TTT[0][0] + TTT[0][1] + TTT[0][2] == num) return true;

        // 4,5,6 빙고 ㅡ
        if(TTT[1][0] + TTT[1][1] + TTT[1][2] == num) return true;

        // 7,8,9 빙고 ㅡ
        if(TTT[2][0] + TTT[2][1] + TTT[2][2] == num) return true;

        // 1,4,7 빙고 ㅣ
        if(TTT[0][0] + TTT[1][0] + TTT[2][0] == num) return true;

        // 2,5,8 빙고 ㅣ
        if(TTT[0][1] + TTT[1][1] + TTT[2][1] == num) return true;

        // 3,6,9 빙고 ㅣ
        if(TTT[0][2] + TTT[1][2] + TTT[2][2] == num) return true;

        // 1,5,9 빙고 \
        if(TTT[0][0] + TTT[1][1] + TTT[2][2] == num) return true;

        // 3,5,7 빙고 /
        if(TTT[0][2] + TTT[1][1] + TTT[2][0] == num) return true;

        return false;
    }
    
    
}