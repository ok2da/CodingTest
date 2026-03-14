def solution(arr):
    arr.remove(min(arr))
    answer = arr if len(arr) else [-1]
    return answer