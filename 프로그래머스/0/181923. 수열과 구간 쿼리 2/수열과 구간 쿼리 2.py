def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        n = 1000001
        for i in range(s, e + 1):
            if arr[i] > k:
                n = min(arr[i], n)
            
        if n == 1000001:
            answer.append(-1)
        else:
            answer.append(n)
    
    return answer