def solution(arr, flag):
    answer = []
    
    for i in range(len(flag)):
        if flag[i]:
            for n in range(0, arr[i] * 2):
                answer.append(arr[i])
        else:
            for m in range(0, arr[i]):
                answer.pop()

            
    
    return answer