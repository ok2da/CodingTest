def solution(n):
    answer = sum([x for x in range(2,n + 1,2) if x % 2 == 0])
    return answer