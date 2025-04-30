def solution(arr, delete_list):
    answer = arr.copy()
    
    for e in delete_list:
        if e in arr:
            answer.remove(e)

    return answer