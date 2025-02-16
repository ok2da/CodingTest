def solution(a, b):
    answer = ''
    
    # 1)
    # if int(str(a) + str(b)) > int(str(b) + str(a)):
    #     answer = int(str(a) + str(b))
    # else:
    #    answer = int(str(b) + str(a))
    
    # 2)
    answer = int(max(f"{a}{b}",f"{b}{a}"))
    
    return answer