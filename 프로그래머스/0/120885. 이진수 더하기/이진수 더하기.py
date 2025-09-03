def solution(bin1, bin2):
    dec = int(bin1, 2) + int(bin2, 2)   # 2진수를 10진수로 변환하여 더하기
    answer = bin(dec)[2:]               # 10진수를 2진수로 변환하고, 접두 빼고 슬라이싱
    
    return answer