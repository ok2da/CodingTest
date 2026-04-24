def solution(x):
    num = sum([int(a) for a in str(x)])
    answer = True if x % num == 0 else False
        
    return answer