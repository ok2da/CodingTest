class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int min = 0;
        int a_max = board.length - 1;
        int b_max = board[0].length - 1;
        
        for(int i = 0; i < board.length; i++){ 
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1) board = solution(board, i, j, min, a_max, b_max);
            }
        }
        
        for(int i = 0; i < board.length; i++){ 
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
    
    public static int[][] solution(int[][] board, int a, int b, int min, int a_max, int b_max){

        if(a - 1 >= min) board[a-1][b] = board[a-1][b] == 0 ? -1 : board[a-1][b];
        if(a + 1 <= a_max) board[a+1][b] = board[a+1][b] == 0 ? -1 : board[a+1][b];
        
        if(b - 1 >= min) board[a][b-1] = board[a][b-1] == 0 ? -1 : board[a][b-1];
        if(b + 1 <= b_max) board[a][b+1] = board[a][b+1] == 0 ? -1 : board[a][b+1];
        
        if(a - 1 >= min && b - 1 >= min) board[a-1][b-1] = board[a-1][b-1] == 0 ? -1 : board[a-1][b-1];
        if(a - 1 >= min && b + 1 <= b_max) board[a-1][b+1] = board[a-1][b+1] == 0 ? -1 : board[a-1][b+1];
        
        if(a + 1 <= a_max && b - 1 >= min) board[a+1][b-1] = board[a+1][b-1] == 0 ? -1 : board[a+1][b-1];
        if(a + 1 <= a_max && b + 1 <= b_max) board[a+1][b+1] = board[a+1][b+1] == 0 ? -1 : board[a+1][b+1];
        
        
        return board;

    }
}