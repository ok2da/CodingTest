import copy
def solution(arr, queries):
    answer = arr.copy()
    
    for s, e, k in queries:
        for i in range(s, e + 1):
            if i % k == 0:
                answer[i] += 1

    return answer