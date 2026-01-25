def solution(s):
    answer = 0
    x = ''
    x_cnt = 0
    n_cnt = 0
    
    for n in s:
        if x_cnt == n_cnt:
            x_cnt = 0
            n_cnt = 0
            answer += 1
            
        if x_cnt == 0:
            x = n;

        if x == n:
            x_cnt += 1    
        else:
            n_cnt += 1
    
    return answer