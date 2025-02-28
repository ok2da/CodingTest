import copy
def solution(num_list):
    answer = copy.deepcopy(num_list)
    prev = num_list[len(num_list) - 2]
    last = num_list[len(num_list) - 1]
    
    if prev < last:
        answer.append(last - prev)
    else:
        answer.append(last * 2)
        
    return answer