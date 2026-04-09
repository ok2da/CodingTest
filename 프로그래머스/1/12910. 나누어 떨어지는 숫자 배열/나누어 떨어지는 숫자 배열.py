def solution(arr, divisor):
    answer = [x for x in arr if x % divisor == 0]
    
    if answer:
        answer.sort()
    else:
        answer.append(-1)
    
    return answer