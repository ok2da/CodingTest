def solution(my_string, is_suffix):
    answer = 0

    for i in range(len(my_string)):
        if my_string[i:] == is_suffix:
            answer = 1
            break
    
    return answer