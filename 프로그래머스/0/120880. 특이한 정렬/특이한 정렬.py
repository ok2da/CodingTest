def solution(numlist, n):
    answer = []
    order = sorted([x for x in numlist], key = lambda x : (abs(x - n), n - x))
    # key = 정렬 기준, lambda = 익명 함수, 조건을 튜플로 만들어 정렬
    
    return order