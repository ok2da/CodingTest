def solution(N, stages):
    answer = []
    p = len(stages)
    fail = [0] * (N + 2)
    result = {}

    for i in stages:
        fail[i] += 1

    for j in range(1, N + 1):
        if p == 0:
            result[j] = 0
        else:
            result[j] = fail[j] / p
        p -= fail[j]
        
    for l, n in sorted(result.items(), key = lambda x : (-x[1], x[0])):
        answer.append(l)
    
    return answer