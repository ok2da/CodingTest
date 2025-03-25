def solution(arr, idx):
    answer = -1
    
    for i in range(len(arr) - 1, idx - 1, -1):
        if arr[i] == 1:
            answer = i
    
    return answer