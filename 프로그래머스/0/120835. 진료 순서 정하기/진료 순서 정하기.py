def solution(emergency):
    sort = sorted(emergency, reverse=True)                      # 내림차순 리스트 생성
    rank = {key : value + 1 for value, key in enumerate(sort)}  # 딕셔너리 생성
    answer = [rank[x] for x in emergency]
    
    return answer