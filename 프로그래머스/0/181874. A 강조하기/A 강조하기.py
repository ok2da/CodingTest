def solution(myString):
    
#     # 1)
#     answer = ''
    
#     # 멤버십 연산자 사용중 true에 해당하는 결과가 1과 0일수도 있어서 int형으로 변환 후 false인 -1과 비교
#     if int('a' in myString) > -1:
#         answer = myString.lower().replace('a','A')
#     else:
#         answer = myString
        
    # 2)
    answer = myString.lower().replace('a','A')
        
    
    return answer