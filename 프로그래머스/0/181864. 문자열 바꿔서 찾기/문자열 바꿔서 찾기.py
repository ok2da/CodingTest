def solution(myString, pat):
    index = 0

    for char in myString:
        temp = 'A' if char == 'B' else 'B'
        if temp == pat[index]:
            index += 1
            if index == len(pat):
                return 1
        else:
            index = 0
    
    return 0