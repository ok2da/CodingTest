def solution(my_string):
    arr = my_string.replace(' - ', ' + -').split('+')

    answer = sum([int(x) for x in arr])
    
    return answer