def solution(numbers):
    answer = []
    length = len(numbers)
    
    for i in range(0, length):
        for j in range(i + 1, length):
            n = numbers[i] + numbers[j]
            if n not in answer:
                answer.append(n)

    answer.sort()

    return answer