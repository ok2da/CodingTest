#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* str1, const char* str2) {
    int len = strlen(str1) + strlen(str2);
    char* answer = (char*)malloc(len + 1);
    
    int str1_len = 0;
    int str2_len = 0;
    
    for(int i = 0; i < len; i++){
        if(i % 2){
            answer[i] = str2[str2_len];
            str2_len++;
        }else {
            answer[i] = str1[str1_len];
            str1_len++;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}