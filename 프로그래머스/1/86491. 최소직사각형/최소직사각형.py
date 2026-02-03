def solution(sizes):
    answer = 0
    w, h = 0, 0

    for a, b in sizes:
        if a < b:       #b가 a보다 클때, 가장 큰 값을 넣는 a로 변경
            a, b = b, a
        w = max(w, a)
        h = max(h, b)
            
    answer = w * h
    
    return answer