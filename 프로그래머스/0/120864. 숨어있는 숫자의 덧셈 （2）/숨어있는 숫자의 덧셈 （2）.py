def solution(my_string):
    answer = 0
    n = 0
    
    for i in my_string:
        if i >= '0' and i <= '9':
            n = n * 10 + int(i)
        else:
            answer += n
            n = 0 
    
    answer += n
    
    return answer