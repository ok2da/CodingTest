def solution(number, limit, power):
    answer = 0
    
    for i in range(1, number + 1):
        stack = []
        for j in range(1, int(i ** 0.5) + 1):
            if i % j == 0:
                stack.append(j)
                if j ** 2 != i:
                    stack.append(i // j)
        
        if len(stack) > limit:
            answer += power
        else:
            answer += len(stack)
    
    return answer