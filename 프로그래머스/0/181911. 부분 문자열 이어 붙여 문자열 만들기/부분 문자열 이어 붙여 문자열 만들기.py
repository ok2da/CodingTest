def solution(my_strings, parts):
    
    # 1) 기존 코드
#     answer = ''
    
#     for i in range(len(parts)):
#         answer += my_strings[i][parts[i][0]:parts[i][1] + 1]
        
    # 2) 개선 코드
    answer = []
    for i in range(len(parts)):
        answer.append(my_strings[i][parts[i][0]:parts[i][1] + 1])
    
    return ''.join(answer)