#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int q, int r, const char* code) {
    int len = strlen(code);
    char* answer = (char*)malloc(sizeof(char) * (len / q) + 1);
    int idx = 0;
    
    for(int i = 0; i < len; i++){
        if(i % q == r) answer[idx++] = code[i];
    }
    
    answer[idx] = '\0';
    
    return answer;
}