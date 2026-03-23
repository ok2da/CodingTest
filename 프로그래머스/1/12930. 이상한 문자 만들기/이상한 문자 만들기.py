def solution(s):
    answer = ''
    check = 0
    
    for c in s:
        if c == ' ':
            check = 0
            answer += ' '
        else:
            if check % 2 == 0:
                answer += c.upper()
            else:
                answer += c.lower()
            check += 1
        
    return answer