def solution(players, callings):
    dic = {player : i for i, player in enumerate(players)}
    
    for calling in callings:
        rank = dic[calling] # 선수의 원래 순위
        
        if rank > 0: # 1등이 아닐때,
            front_player = players[rank - 1] # 앞 선수 이름
            
            players[rank - 1], players[rank] = players[rank], players[rank - 1]
            
            dic[calling] -= 1
            dic[front_player] += 1   
        
    return players