def solution(myString, pat):
    answer = 0
    
    # 1)
    # while True:
    #     if myString.find(pat) > -1:
    #         answer += 1
    #         myString = myString[myString.find(pat) + 1:]
    #     else :
    #         break;
    
    for i in range(len(myString)):
        if myString[i:len(pat) + i] == pat:
            answer += 1
    
    return answer