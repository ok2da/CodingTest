def solution(array):
    answer = [0, 0]
    
    for i, x in enumerate(array):
        if answer[0] < x:
            answer[0], answer[1]  = x, i
    
    return answer