def solution(arr):
    answer = [arr[0]]
    
    for i, n in enumerate(arr, start = 1):
        if answer[-1] != n:
            answer.append(n)

    return answer