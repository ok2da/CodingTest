def solution(answers):
    answer = []
    
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    p1, p2, p3, pm = 0, 0, 0, 0
    
    for i, n in enumerate(answers):
        if a[i % 5] == n: p1 += 1
        if b[i % 8] == n: p2 += 1
        if c[i % 10] == n: p3 += 1
        
    pm = max(p1,p2,p3)
    
    if p1 == pm: answer.append(1)
    if p2 == pm: answer.append(2)
    if p3 == pm: answer.append(3)
    
    return answer