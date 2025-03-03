import copy

def solution(arr, queries):
    answer = arr.copy()
    
    for i in range(len(queries)):
        a = queries[i][0]
        b = queries[i][1]
        
        temp = answer[a]
        answer[a] = answer[b]
        answer[b] = temp
    
    return answer