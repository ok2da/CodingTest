def solution(n):
    sqrt = n ** 0.5
    
    answer = (sqrt + 1) ** 2 if sqrt % 1 == 0 else -1
    
    return answer