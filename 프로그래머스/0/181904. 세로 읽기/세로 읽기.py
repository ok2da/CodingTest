def solution(my_string, m, c):
    answer = ''.join(my_string[c - 1::m])
    return answer