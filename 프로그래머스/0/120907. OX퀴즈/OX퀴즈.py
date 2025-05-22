def solution(quiz):
    answer = []
    
    for q in quiz:
        element = q.split(' ');
        op = element[1]
        X = int(element[0])
        Y = int(element[2])
        Z = int(element[4])

        if op == '-':
            answer.append("O") if X - Y == Z else answer.append("X")
        elif op == '+':
            answer.append("O") if X + Y == Z else answer.append("X")

    return answer