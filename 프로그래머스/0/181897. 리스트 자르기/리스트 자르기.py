def solution(n, slicer, num_list):
    answer = []
    
    a = slicer[0]
    b = slicer[1] + 1
    c = slicer[2]
    
    
    if n == 1:
        for i in range(0, b):
            answer.append(num_list[i]) 
    elif n == 2:
        for i in range(a, len(num_list)):
            answer.append(num_list[i])
    elif n == 3:
        for i in range(a, b):
            answer.append(num_list[i])
    elif n == 4:
        for i in range(a, b, c):
            answer.append(num_list[i])
    
    return answer