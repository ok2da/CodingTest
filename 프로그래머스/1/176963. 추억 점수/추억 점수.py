def solution(name, yearning, photo):
    answer = []
    dic = dict(zip(name,yearning))
    
    for p in photo:
        score = 0
        for x in p:
            if x in dic:
                score += dic[x]    
        answer.append(score)
    
    return answer