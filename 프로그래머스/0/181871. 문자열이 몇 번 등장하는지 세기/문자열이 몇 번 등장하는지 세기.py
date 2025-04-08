def solution(myString, pat):
    answer = 0
    
    while True:
        if myString.find(pat) > -1:
            answer += 1
            myString = myString[myString.find(pat) + 1:]
        else :
            break;
    
    return answer