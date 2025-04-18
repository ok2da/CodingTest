def solution(arr, k):
    answer = [-1 for x in range(k)]
    index = 0
    
    for a in arr:
        if a not in answer:
            if index < k:
                answer[index] = a
                index += 1
            else:
                break
        
    return answer