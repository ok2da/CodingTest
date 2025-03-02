def solution(numLog):
    answer = ''
    
    for i in range(len(numLog) - 1):
        number = numLog[i + 1] - numLog[i]
        
        if number == 1:
            answer += 'w'
        elif number == -1:
            answer += 's'
        elif number == 10:
            answer += 'd'
        elif number == -10:
            answer += 'a'
    
    return answer