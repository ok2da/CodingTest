def solution(before, after):
    answer = -1
    before_sort = sorted(before)
    after_sort = sorted(after)

    answer = 1 if before_sort == after_sort else 0
    
    return answer