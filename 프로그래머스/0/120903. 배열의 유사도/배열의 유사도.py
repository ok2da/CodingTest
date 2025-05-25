def solution(s1, s2):
    answer = len([x for x in s2 if x in s1])
    return answer