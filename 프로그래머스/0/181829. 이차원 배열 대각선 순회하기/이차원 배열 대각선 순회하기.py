def solution(board, k):
    # answer = sum([board[i][j] for i, x in enumerate(board) for j in range(len(x)) if i + j <= k])
    answer = 0
    
    for i, x in enumerate(board):
        for j in range(len(x)):
            if i + j <= k:
                answer += board[i][j]
    
    return answer