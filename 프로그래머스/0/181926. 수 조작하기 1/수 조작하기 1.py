def solution(n, control):
    answer = n
    
    for char in control:
        answer += updateValue(char)
    
    return answer

def updateValue(key):
    if key == 'w':
        return 1
    elif key == 's':
        return -1
    elif key == 'd':
        return 10
    elif key == 'a':
        return -10
    else:
        return 0
