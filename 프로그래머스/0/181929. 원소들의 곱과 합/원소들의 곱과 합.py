def solution(num_list):
    answer = 0
    multiplication = 1
    squared = 0

    for i in range(len(num_list)):
        multiplication *= num_list[i]
        squared += num_list[i]
        
    answer = 1 if multiplication < squared ** 2 else 0
    
    return answer