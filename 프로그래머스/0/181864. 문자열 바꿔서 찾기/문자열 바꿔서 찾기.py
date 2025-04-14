def solution(myString, pat):
    answer = 0
    index = 0
    
    for char in myString:
        if char != pat[index]:
            index += 1
        else:
            index = 0
        
        if index == len(pat):
            return 1
    
    return answer