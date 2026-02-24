def solution(board, moves):
    answer = 0
    bukkit = []
    
    for m in moves:
        for i in range(len(board)):    # n x n 이 같은지?
            if board[i][m - 1] != 0:
                bukkit.append(board[i][m - 1])
                board[i][m - 1] = 0
                
                if len(bukkit) >= 2 and bukkit[-1] == bukkit[-2]:
                    bukkit.pop(-1)
                    bukkit.pop(-1)
                    answer += 2
                    
                break
    
    return answer