import re

def solution(new_id):
    answer = new_id
    
    #1
    answer = new_id.lower()
    #2
    answer = re.sub('[^a-z0-9-_.]', "", answer)
    #3
    answer = re.sub('\.+', '.', answer)
    #4
    answer = re.sub('^[.]|[.]$', '', answer)
    #5
    answer = 'a' if answer == '' else answer
    #6
    answer = re.sub('[.]$', '', answer[:15])
    #7
    answer = answer + (answer[-1] * (3 - len(answer))) if len(answer) < 3 else answer
    
    
    return answer