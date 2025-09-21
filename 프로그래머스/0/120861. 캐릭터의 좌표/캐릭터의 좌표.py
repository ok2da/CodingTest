def solution(keyinput, board):
    answer = [0, 0]
    xy = [board[0] // 2, board[1] // 2]
    
    for m in keyinput:
        if m == "up":
            if answer[1] != xy[1]:
                answer[1] += 1
        elif m == "down":
            if answer[1] != -xy[1]:
                answer[1] -= 1
        elif m == "left":
            if answer[0] != -xy[0]:
                answer[0] -= 1
        elif m == "right":
            if answer[0] != xy[0]:
                answer[0] += 1
    
    return answer