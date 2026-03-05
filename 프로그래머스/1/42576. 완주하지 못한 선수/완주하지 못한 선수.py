from collections import Counter
def solution(participant, completion):
    answer = Counter(participant) - Counter(completion) # 키(이름) 기준 값(이름이 나온 횟수)을 서로 뺌 (중복제거)
    
    return next(iter(answer))                           # 딕셔너리에 마지막으로 남은(첫번째) 키만 뽑음