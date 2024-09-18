class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int min = 0;
        int a_max = board.length - 1;
        int b_max = board[0].length - 1;
        
        // 위험지역을 찾아라
        for(int i = 0; i < board.length; i++){ 
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1) {
                    // 기준점부터 상,하
                    if(i - 1 >= min) board[i-1][j] = board[i-1][j] == 0 ? -1 : board[i-1][j];
                    if(i + 1 <= a_max) board[i+1][j] = board[i+1][j] == 0 ? -1 : board[i+1][j];

                    // 기준점부터 좌,우
                    if(j - 1 >= min) board[i][j-1] = board[i][j-1] == 0 ? -1 : board[i][j-1];
                    if(j + 1 <= b_max) board[i][j+1] = board[i][j+1] == 0 ? -1 : board[i][j+1];

                    // 기준점으로 상좌, 상우
                    if(i - 1 >= min && j - 1 >= min) 
                        board[i-1][j-1] = board[i-1][j-1] == 0 ? -1 : board[i-1][j-1];
                    if(i - 1 >= min && j + 1 <= b_max) 
                        board[i-1][j+1] = board[i-1][j+1] == 0 ? -1 : board[i-1][j+1];

                    // 기준점으로 하좌, 하우
                    if(i + 1 <= a_max && j - 1 >= min) 
                        board[i+1][j-1] = board[i+1][j-1] == 0 ? -1 : board[i+1][j-1];
                    if(i + 1 <= a_max && j + 1 <= b_max) 
                        board[i+1][j+1] = board[i+1][j+1] == 0 ? -1 : board[i+1][j+1];
                }
                
            }
        }
        
        // 안전지역을 찾아라
        for(int i = 0; i < board.length; i++){ 
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}