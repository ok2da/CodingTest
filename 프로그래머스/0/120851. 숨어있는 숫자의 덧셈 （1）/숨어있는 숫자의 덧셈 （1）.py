def solution(my_string):
    answer = sum([int(x) for x in my_string if x >= '0' and x <= '9'])
    return answer