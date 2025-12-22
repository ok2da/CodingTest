def solution(array, height):
    answer = sum([1 for x in array if x > height])
    return answer