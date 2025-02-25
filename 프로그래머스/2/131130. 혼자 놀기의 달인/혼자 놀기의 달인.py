def solution(cards):
    answer = 0
    group = []
    visited = [False] * len(cards)
    
    for i in range(len(cards)):
        index = i
        count = 0
        
        if not visited[index]:  # 방문이 처음일 때,
            while not visited[index]:   # 방문을 확인하여 그룹이 지어질때까지 반복하고 횟수 기록
                visited[index] = True
                index = cards[index] - 1
                count += 1
            group.append(count)     # 횟수를 list에 추가
        
    if len(group) > 1:  # 그룹이 1개 이상일때, 정렬 후 가장 큰 값 2개를 곱셈하여 리턴
        group.sort(reverse = True)
        answer = group[0] * group[1]
    
    return answer