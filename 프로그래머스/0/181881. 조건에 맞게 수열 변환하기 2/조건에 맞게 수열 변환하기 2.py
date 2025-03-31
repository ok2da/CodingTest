def solution(arr):
    answer = 0
    
    while(True):
        temp_arr = []
        count = 0
        
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                temp_arr.append(arr[i] / 2)
            elif arr[i] < 50 and arr[i] % 2 == 1:
                temp_arr.append(arr[i] * 2 + 1)
            else:
                temp_arr.append(arr[i])
                
            if arr[i] == temp_arr[i]:
                count += 1
        
        if count == len(arr):
            return answer
        else:
            arr = temp_arr
            answer += 1

    return -1