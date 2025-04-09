def solution(strArr):
    answer = []
    contains = 'ad'
    
    for str in strArr:
        # if not str.find("ad") + 1: <- 비교가 이상해서 그냥 비교연산자로 수정
        # if str.find("ad") == -1: <- 가독성 안좋아서 수정
        if not contains in str:
            answer.append(str)
    
    return answer