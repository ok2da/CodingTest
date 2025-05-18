import math
def solution(n):
    answer = 2 if math.sqrt(n) % 1 else 1
    return answer