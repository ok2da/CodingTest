def solution(arr):
    answer = -1
    arr_count = 0
    
    while(True):
        temp_arr = []
        result_count = 0
        
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                temp_arr.append(arr[i] / 2)
            elif arr[i] < 50 and arr[i] % 2 == 1:
                temp_arr.append(arr[i] * 2 + 1)
            else:
                temp_arr.append(arr[i])
                
            if arr[i] == temp_arr[i]:
                result_count += 1
        
        if result_count == len(arr):
            return arr_count
        else:
            arr = temp_arr
            arr_count += 1

    return answer