def solution(rsp):
    #1) 
    # answer = ''
    #
    # for n in rsp:
    #     if n == '2':
    #         answer += '0'
    #     elif n == '0':
    #         answer += '5'
    #     elif n == '5':
    #         answer += '2'
    
    #2)
    dic = {'2':'0','0':'5','5':'2'}
    answer = ''.join(dic[x] for x in rsp)
    
    return answer