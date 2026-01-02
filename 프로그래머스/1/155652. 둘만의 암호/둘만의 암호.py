def solution(s, skip, index):
    answer = ''
    
    atoz = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    
    for i in skip:
        atoz.remove(i);
    
    for j in s:
        pos = atoz.index(j) if j in atoz else -1
        answer += atoz[(pos + index) % len(atoz)]

    
    return answer