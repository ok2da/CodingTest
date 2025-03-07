def solution(n):
    answer = [n]
    
    while True:
        
        if n == 1:
            break
        if n % 2 == 0:
            n /= 2
            answer.append(n)
        elif n % 2 == 1:
            n = 3 * n + 1
            answer.append(n)
    
    return answer