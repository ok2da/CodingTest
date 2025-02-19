def solution(n):
    answer = 0
    # '==' 같은 비교연산자를 쓰지 않아도 0, 1에 따라 결과를 나눌 수 있음
    if n % 2 == 0:
        for i in range(2, n + 1, 2):
            # 'i**2' 같은 거듭제곱으로 사용 가능
            answer += i * i
    else:
        for j in range(1, n + 1, 2):
            answer += j
            
    return answer