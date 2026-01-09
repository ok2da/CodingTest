def solution(s):
    answer = []
    check = [-1] * 26
    
    for i, c in enumerate(s):
        index = ord(c) - ord('a')
        
        if check[index] == -1:
            check[index] = i;
            answer.append(-1)
        else:
            answer.append(i - check[index])
        check[index] = i;
            
    return answer