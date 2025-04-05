def solution(myString):
    answer = ''
    
    if int('a' in myString) > -1:
        answer = myString.lower().replace('a','A')
    else:
        answer = myString
        
    
    return answer