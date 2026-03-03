def solution(d, budget):
    answer = 0
    
    d.sort()                # 정렬
    
    while sum(d) > budget:  # d의 합이 budget보다 같거나 작아질때
        d.pop()
        
    answer = len(d)
    
    return answer