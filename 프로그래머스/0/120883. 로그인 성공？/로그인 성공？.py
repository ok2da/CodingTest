def solution(id_pw, db):
    answer = 'fail'
    
    for userId, userPw in db:
        if userId == id_pw[0]:
            if userPw == id_pw[1]:
                answer = 'login'
                break
            else:
                answer = 'wrong pw'
                break
        
    return answer