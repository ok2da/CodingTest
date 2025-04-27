def solution(rank, attendance):
    answer = 0
    
    rank = [[i,rank[i]] for i in range(len(rank)) if attendance[i]]
    
    # 익명함수
    rank = sorted(rank, key=lambda x: x[1])
    
    answer = 10000 * rank[0][0] + 100 * rank[1][0] + rank[2][0]
    
    return answer