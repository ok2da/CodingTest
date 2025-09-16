def solution(polynomial):
    answer = []
    x = 0
    n = 0
    
    for i in polynomial.split(' + '):
        if i[-1] == 'x':
            if i == 'x':
                x += 1
            else:
                x += int(i[:-1])
        else:
            n += int(i)
    
    if x:
        answer.append('x' if x == 1 else f'{x}x')
    if n:
        answer.append(str(n))
    
    return ' + '.join(answer)