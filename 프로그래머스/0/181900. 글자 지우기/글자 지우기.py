def solution(my_string, indices):
    answer = ''
    
    str = list(my_string)
    
    for i in indices:
        str[i] = ''
        
    answer = ''.join(str)
    
    return answer