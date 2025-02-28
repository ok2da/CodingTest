import copy
def solution(num_list):
    answer = copy.deepcopy(num_list) # 깊은복사
    prev = num_list[-2] # 음수인덱싱
    last = num_list[-1]
    
    if prev < last:
        answer.append(last - prev)
    else:
        answer.append(last * 2)
        
    return answer