def solution(a, b):
    answer = 0
    
    # 모두 홀수, 하나 홀수, 모두 아님
    if a % 2 and b % 2:
        answer = a**2 + b**2
    elif a % 2 or b % 2:
        answer = 2 * (a + b)
    else:
        answer = abs(a - b)
    
    return answer