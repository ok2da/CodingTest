def solution(arr):
    answer = []
    
    for i in arr:
        if not answer:
            answer.append(i)
        else:
            if answer[-1] == i:
                answer.pop()
            else:
                answer.append(i)
                
    if not answer:
        answer.append(-1)
    
    return answer