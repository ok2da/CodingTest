def solution(a, b):
    
    # 1)
    # A = int(str(a) + str(b))
    # B = 2 * a * b
    # answer = A if A >= B else B
    
    # 2)
    answer = max(int(str(a) + str(b)), 2 * a * b)
    
    return answer