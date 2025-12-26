def solution(array):
    answer = 0
    check = 0
    
    for n in set(array):
        if check < array.count(n):
            check = array.count(n)
            answer = n
        elif check == array.count(n):
            answer = -1
    
    return answer