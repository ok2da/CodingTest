def solution(my_string, n):
    answer = ''.join([x * n for x in my_string])
    return answer