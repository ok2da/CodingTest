MOVE = {
    'E' : (0, 1),
    'W' : (0, -1),
    'S' : (1, 0),
    'N' : (-1, 0)
}

def solution(park, routes):
    W, H, length = len(park[0]), len(park), len(routes)
    answer = find_start(W, H, park);
    
    for i in range(length):
        direction, distance = find_postion(routes[i])
        answer = move_postion(W, H, direction, distance, answer, park)
        
    return answer

def find_start(W, H, park):
    for i in range(H):
        for j in range(W):
            if park[i][j] == 'S':
                return [i,j]
            
def find_postion(routes):
    op, n = routes.split(' ')
    
    # if direction == 'E':
    #     return [0, 1], int(distance)
    # elif direction == 'W':
    #     return [0, -1], int(distance)
    # elif direction == 'S':
    #     return [1, 0], int(distance)
    # elif direction == 'N':
    #     return [-1, 0], int(distance)
    # else:
    #     return 'ERROR'
    
    if op not in MOVE:
        return 'ERROR'
    
    return list(MOVE[op]), int(n)
    
            
def move_postion(W, H, direction, distance, answer, park):
    temp = answer[:] # copy()
    
    for _ in range(distance):
        temp[0] += direction[0]
        temp[1] += direction[1]
        
        if temp[0] < 0 or temp[0] >= H or temp[1] < 0 or temp[1] >= W or park[temp[0]][temp[1]] == 'X':
            return answer
        
    return temp

