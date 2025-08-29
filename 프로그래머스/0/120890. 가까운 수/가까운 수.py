def solution(array, n):
    answer = 0
    diff = 101;
    
    array.sort()
    
    for i in array:
        temp = abs(n - i)
        if diff > abs(n - i) :
            answer = i
            diff = temp
    
    return answer