def solution(numbers, n):
    answer = 0
    
    for number in numbers:
        if answer <= n:
            answer += number
        else:
            break
    
    return answer