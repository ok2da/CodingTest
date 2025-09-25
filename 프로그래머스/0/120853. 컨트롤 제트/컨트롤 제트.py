def solution(s):
    answer = 0
    
    for i in range(len(s := s.split(" "))):
        if s[i] != 'Z':
            answer += int(s[i])
        else:
            answer -= int(s[i - 1])
    
    return answer