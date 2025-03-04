def solution(arr, queries):
    answer = []
    
    for s, e, k in queries:
        n = 1000001
        for i in range(s, e + 1):
            if arr[i] > k:
                n = min(arr[i], n)
            
        answer.append(n if n != 1000001 else -1)
    
    return answer