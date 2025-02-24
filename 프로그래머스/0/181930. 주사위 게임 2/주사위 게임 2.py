def solution(a, b, c):
    answer = 0
    
    all_Different = a != b and b != c and c != a
    all_Equals = a == b and b == c
    
    if all_Different:
        answer = a+b+c
    elif all_Equals:
        answer = (a+b+c)*(a**2+b**2+c**2)*(a**3+b**3+c**3)
    else:
        answer = (a+b+c)*(a**2+b**2+c**2)
    
    return answer