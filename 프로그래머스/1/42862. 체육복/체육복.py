def solution(n, lost, reserve):
    answer = n
    student = [1] * (n + 1)
    
    for r in reserve:
        student[r] += 1
        
    for l in lost:
        student[l] -= 1
    
    for l in sorted(lost):
        if student[l] == 0:
            if l - 1 >= 0 and student[l - 1] == 2:
                student[l - 1] = 1
            elif l + 1 <= n and student[l + 1] == 2:
                student[l + 1] = 1
            else:
                answer -= 1

    return answer