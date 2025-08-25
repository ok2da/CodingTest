def solution(my_string):
    answer = ''
    
    for ch in my_string:
        if ch < 'a': # islower()
            answer += ch.lower()
        else:
            answer += ch.upper()
    
    return answer