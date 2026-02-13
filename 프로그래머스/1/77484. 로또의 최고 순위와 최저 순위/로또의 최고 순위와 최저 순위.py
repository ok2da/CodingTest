def solution(lottos, win_nums):
    answer = [0, 0]
    rank = [6,6,5,4,3,2,1]
    max = 0
    min = 0
    
    for j in lottos:
        if j == 0:
            max += 1
        elif j in win_nums:
            min += 1

    answer = [rank[max + min], rank[min]]
    
    return answer