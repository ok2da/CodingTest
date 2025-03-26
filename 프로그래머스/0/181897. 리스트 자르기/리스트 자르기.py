def solution(n, slicer, num_list):
    answer = []
    
    # 1)
#     a = slicer[0]
#     b = slicer[1] + 1
#     c = slicer[2]
    
#     if n == 1:
#         for i in range(0, b):
#             answer.append(num_list[i]) 
#     elif n == 2:
#         for i in range(a, len(num_list)):
#             answer.append(num_list[i])
#     elif n == 3:
#         for i in range(a, b):
#             answer.append(num_list[i])
#     elif n == 4:
#         for i in range(a, b, c):
#             answer.append(num_list[i])
    
    # 2)
    
    a, b, c = slicer
    b += 1
    
    if n == 1:
        answer = num_list[0:b]
    elif n == 2:
        answer = num_list[a:]
    elif n == 3:
        answer = num_list[a:b]
    elif n == 4:
        answer = num_list[a:b:c]
        
    return answer