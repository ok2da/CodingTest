def solution(my_string, letter):
    answer = ''.join([x for x in my_string if x != letter])
    return answer