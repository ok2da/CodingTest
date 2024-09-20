class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int x_max = board[0] / 2;
        int x_min = 0 - (board[0] / 2);
        int y_max = board[1] / 2;
        int y_min = 0 - (board[1] / 2);
        
        for(int i = 0; i < keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    if(answer[0] != x_min) answer[0]--;
                    break;
                case "right":
                    if(answer[0] != x_max) answer[0]++;
                    break;
                case "up":
                    if(answer[1] != y_max) answer[1]++;
                    break;
                case "down":
                    if(answer[1] != y_min) answer[1]--;
                    break;
            }
        }

        return answer;
    }
}