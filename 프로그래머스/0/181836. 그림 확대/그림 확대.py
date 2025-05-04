def solution(picture, k):
    answer = []

    for i, e in enumerate(picture):
        line = ''.join([x * k for x in e])
        for r in range(k):
            answer.append(line)
    
    return answer