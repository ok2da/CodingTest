def solution(code):
    answer = ''
    mode = 0
    
    for i in range(len(code)):
        
        if code[i] == '1':
            mode = 1 - mode
            continue
        else:
            if mode == 1 and i % 2 == 1:
                answer += code[i]
            elif mode == 0 and i % 2 == 0:
                answer += code[i]
    
    if not answer:
        answer = "EMPTY"

    return answer