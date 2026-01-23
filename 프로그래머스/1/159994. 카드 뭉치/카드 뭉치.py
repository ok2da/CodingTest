def solution(cards1, cards2, goal):
    answer = 'Yes'
    
    for i in range(len(goal)):
        if not cards1 and not cards2:
            break;
        if cards1 and cards1[0] == goal[i]:
            cards1.pop(0)
        elif cards2 and cards2[0] == goal[i]:
            cards2.pop(0)
        else:
            return 'No'
            
    return answer