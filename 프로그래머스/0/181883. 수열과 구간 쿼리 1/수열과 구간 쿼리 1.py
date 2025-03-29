def solution(arr, queries):
    answer = arr.copy()
    
    for s, e in queries:
        for i in range(s,e + 1):
            answer[i] += 1

    return answer