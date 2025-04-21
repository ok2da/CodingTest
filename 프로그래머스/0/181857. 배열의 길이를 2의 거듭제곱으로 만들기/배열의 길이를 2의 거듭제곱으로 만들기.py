def solution(arr):
    answer = arr.copy()
    length = 1
    
    while length < len(arr):
        length *= 2
        
    if len(arr) < length:
        answer += [0 for i in range(length - len(arr))]

    return answer