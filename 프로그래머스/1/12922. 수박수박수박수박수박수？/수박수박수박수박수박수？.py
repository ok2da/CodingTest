def solution(n):
    answer = ''.join(["수" if x % 2 == 0 else "박" for x in range(n)])
    return answer