def solution(seoul):
    answer = ''
    for i, n in enumerate(seoul):
        if n == "Kim":
            answer = "김서방은 " + str(i) + "에 있다"
    return answer