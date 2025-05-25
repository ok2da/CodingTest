def solution(s1, s2):
    answer = sum([1 for x in s2 if x in s1])
    return answer