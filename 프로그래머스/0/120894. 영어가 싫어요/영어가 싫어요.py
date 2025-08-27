def solution(numbers):
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    answer = 0
    
    for i, n in enumerate(num):
        numbers = numbers.replace(n, str(i))

    answer = int(numbers)
    
    return answer