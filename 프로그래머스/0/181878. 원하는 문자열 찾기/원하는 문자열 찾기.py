def solution(myString, pat):
    
    # 1)
    # find() = 찾고자 하는 인덱스가 첫번째 위치인 경우 0을반환, 그 외 1을반환, 찾지 못할경우 -1을 반환
    # answer = 1 if myString.lower().find(pat.lower()) >= 0 else 0
    
    answer = int(pat.lower() in myString.lower())

    return answer