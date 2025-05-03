def solution(order):
    answer = sum(5000 if "cafelatte" in menu else 4500 for menu in order)
    
    return answer