import copy
def solution(arr):
    answer = copy.deepcopy(arr)
    
    if len(arr) > len(arr[0]):
        for i in range(len(answer)):
            answer[i] += [0 for _ in range(len(arr) - len(arr[0]))]

    elif len(arr) < len(arr[0]):
        for i in range(len(arr[0]) - len(arr)):
            answer.append([0] * len(arr[0]))
    
    return answer