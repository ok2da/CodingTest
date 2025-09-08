def solution(a, b):
    answer = 0
    
    while True:
        if b % 5 == 0:
            b //= 5
        elif b % 2 == 0:
            b //= 2
        else:
            break
    
    answer = 1 if a % b == 0 else 2
    
    return answer