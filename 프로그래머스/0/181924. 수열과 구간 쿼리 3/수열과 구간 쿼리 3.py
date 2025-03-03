import copy

def solution(arr, queries):
    answer = arr.copy()
    
    # 1)
#     for i in range(len(queries)):
#         a = queries[i][0]
#         b = queries[i][1]
        
#         temp = answer[a]
#         answer[a] = answer[b]
#         answer[b] = temp

    # 2) 다중 할당, 튜플 언패킹 -> 파이썬은 이게 된다 (임시변수 x)
    for a, b in queries:
        answer[a], answer[b] = answer[b], answer[a]
    
    return answer