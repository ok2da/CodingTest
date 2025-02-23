def solution(a, d, included):
    answer = 0
    temp = a
    
    for i in range(len(included)):
        answer += temp if included[i] else 0
        temp += d
    
    return answer