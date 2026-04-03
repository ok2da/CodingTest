def solution(s):
    if s.isdigit() == False:
        return False
    
    if len(s) != 4 and len(s) != 6:
        return False
    
    return True