def solution(k, m, score):
    answer = 0

    score.sort(reverse = True)
    answer = sum(score[m - 1::m]) * m
    
    return answer