def solution(myString, pat):
    
    # find = 처음 찾는 문자열 인덱스, rfind = 마지막 찾는 문자열 인덱스
    answer = myString[0 : myString.rfind(pat) + len(pat)]
    
    return answer