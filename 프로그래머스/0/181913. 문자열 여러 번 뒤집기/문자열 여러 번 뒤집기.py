
def solution(my_string, queries):
    #1) O(N * M), 새로운 문자열을 지속적으로 생성
#     answer = my_string
    
#     for s, e in queries:
#         temp = answer[s : e + 1][::-1]
#         answer = answer[0:s] + temp + answer[e + 1:]

    #2) O(N + M * K), 리스트에서 슬라이싱하고 뒤집기
    answer = ''
    
    char_list = list(my_string)
    
    for s, e in queries:
        char_list[s : e + 1] = char_list[s : e + 1][::-1]
        
    answer = ''.join(char_list)
    
    return answer