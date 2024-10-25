class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 가로 크기, 뽑은 인형 배열, 각 라인 인형 최대 수, 라인 인덱스
        int len = board[0].length;
        int[] basket = new int[1001];
        int[] max = new int[len + 1];
        int index = 1;
        
        // 라인별 인형 최대 수 배열에 삽입
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                max[j + 1] += board[i][j] >= 1 ? 1 : 0;
            }
        }
        
        // 인형 뽑기
        for(int k = 0; k < moves.length; k++){
            // 라인에 인형이 하나라도 있을때 바구니에 인형 추가, 최대 수 감소, 인덱스 증가
            if(max[moves[k]] != 0){
                basket[index] = board[len - max[moves[k]]][moves[k] - 1];
                max[moves[k]]--;
                index++;
            }
            
            // 라인에 인형이 2개 이상 쌓였을때 (인덱스가 1부터 시작해서 3 이상 검사)
            if(index >= 3){
                while(true){
                    // 바스켓에 쌓인 인형이 있을때와 수가 같을때 인형 제거, result 증가, 인덱스 감소
                    if(basket[index - 1] != 0 && basket[index - 2] != 0 && basket[index - 1] == basket[index - 2]){
                        basket[index - 1] = 0;
                        basket[index - 2] = 0;
                        answer += 2;
                        index -= 2;
                    }else {
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}