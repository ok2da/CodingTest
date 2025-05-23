def solution(n, numlist):
    answer = [x for x in numlist if not x % n]
    return answer