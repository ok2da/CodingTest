def solution(arr):
    stk = []
    i = 0
    
    # 파이썬은 for문 i값 조작 불가능
    while i < len(arr):
        if not stk:
            stk.append(arr[i])
            i += 1
        elif stk[-1] < arr[i]:
            stk.append(arr[i])
            i += 1
        elif stk[-1] >= arr[i]:
            stk.pop()
    
    return stk