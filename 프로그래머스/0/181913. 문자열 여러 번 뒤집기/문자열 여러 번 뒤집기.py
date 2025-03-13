
def solution(my_string, queries):
    answer = my_string
    
    for s, e in queries:
        temp = answer[s : e + 1][::-1]
        answer = answer[0:s] + temp + answer[e + 1:]
    
    return answer