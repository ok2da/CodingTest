def solution(my_string):
    answer = ''
    str = []
    
    for ch in my_string:
        if ch not in str:
            str.append(ch)
    
    answer = ''.join(str)
    
    return answer