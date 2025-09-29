def solution(my_string):
    answer = sorted([int(x) for x in my_string if x.isdigit()])
    return answer