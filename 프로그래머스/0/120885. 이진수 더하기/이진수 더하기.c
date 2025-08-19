#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* bin1, const char* bin2) {
    char* answer = (char*)malloc(12 * sizeof(char));
    int dicimal = 0;
    size_t len1 = strlen(bin1), len2 = strlen(bin2);
    int idx = 0;
    
    // 2진수 -> 10진수 변환
    for(int i = 0; i < len1; i++){
        if(bin1[i] == '1'){
            dicimal += 1 << (len1 - 1 - i);
        } 
    }
    for(int j = 0; j < len2; j++){
        if(bin2[j] == '1'){
            dicimal += 1 << (len2 - 1 - j);
        } 
    }
    
    // "0" "0" 일때 리턴
    if(dicimal == 0) return "0";
    
    // 10진수 -> 2진수 변환
    while(dicimal > 0){
        answer[idx++] = '0' + (dicimal % 2);
        dicimal /= 2;
    }
    
    // 2진수 역순 변환
    for(int k = 0; k < idx / 2; k++){
        char temp = answer[k];
        answer[k] = answer[idx - 1 - k];
        answer[idx - 1 - k] = temp;
    }
    
    // 크기 조절, 널 문자 추가
    answer = realloc(answer, idx + 1);
    answer[idx] = '\0';
    
    return answer;
}