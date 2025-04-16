def solution(arr, flag):
    answer = []
    
    for i in range(len(flag)):
        X = arr[i]
        if flag[i]:
            for n in range(0, X * 2):
                answer.append(X)
        else:
            for m in range(0, X):
                answer.pop()

            
    
    return answer