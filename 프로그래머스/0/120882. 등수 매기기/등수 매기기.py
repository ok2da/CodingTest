def solution(score):
    answer = []
    
    # index() 사용
#     avgScore = [sum(s) / 2 for s in score]
#     sortedScore = sorted(avgScore, reverse = True)

#     for i, s in enumerate(avgScore):
#         answer.append(sortedScore.index(s) + 1)

    # 딕셔너리 사용 (범위가 늘어나면 좀더 효율적)
    avgScore = sorted([sum(s) / 2 for s in score], reverse = True)
    scoreRank = {}
    
    for i, s in enumerate(avgScore, start = 1):
        if s not in scoreRank:  # .keys() 와 동일
            scoreRank[s] = i
    
    answer = [scoreRank[sum(x) / 2] for x in score]
    
    return answer