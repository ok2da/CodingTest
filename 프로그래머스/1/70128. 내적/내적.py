def solution(a, b):
    answer = sum([A * B for A, B in zip(a, b)])
    return answer