def solution(num_list):
    answer = max(sum(num_list[1::2]),sum(num_list[0::2]))
    return answer