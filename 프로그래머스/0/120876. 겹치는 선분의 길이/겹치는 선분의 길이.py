def solution(lines):
    answer = 0
    allLine = [0] * 201
    min = 101
    
    for start, end in lines:
        for n in range(start, end):
            allLine[n + 100] += 1
            
    for i in range(0, 200):
        if allLine[i] > 1:
            answer += 1;
    
    return answer