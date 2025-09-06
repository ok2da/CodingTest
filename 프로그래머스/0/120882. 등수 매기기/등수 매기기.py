def solution(score):
    answer = []
    avgScore = [sum(s) / 2 for s in score]
    sortScore = sorted(avgScore, reverse = True)

    for i, s in enumerate(avgScore):
        answer.append(sortScore.index(s) + 1)
    
    return answer