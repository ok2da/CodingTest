def solution(array):
    answer = 0
    
    for x in array:
        while x > 0:
            if x % 10 == 7:
                answer += 1
            x //= 10

    return answer