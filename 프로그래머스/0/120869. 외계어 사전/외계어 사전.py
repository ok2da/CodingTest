def solution(spell, dic):
    answer = 2  
    spell = sorted(spell)
    
    for d in dic:        
        if ''.join(sorted(d)) == ''.join(spell):
            answer = 1
            break

    return answer