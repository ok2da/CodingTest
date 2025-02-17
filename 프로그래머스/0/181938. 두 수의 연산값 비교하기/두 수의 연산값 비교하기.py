def solution(a, b):
    A = int(str(a) + str(b))
    B = 2 * a * b
    
    answer = A if A >= B else B
    
    return answer