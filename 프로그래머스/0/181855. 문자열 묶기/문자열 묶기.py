def solution(strArr):
    answer = 0
    
    arrlen = [0] * 31
    
    for str in strArr:
        arrlen[len(str)] += 1
        
    answer = max(arrlen)
    
    return answer