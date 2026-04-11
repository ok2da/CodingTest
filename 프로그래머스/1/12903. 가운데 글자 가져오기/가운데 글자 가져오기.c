#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* s) {
    int i = strlen(s);
    size_t len = i % 2 == 0 ? 3 : 2;
    char* answer = (char*)malloc(len * sizeof(char));
    
    if(len == 2){
        answer[0] = s[i / 2];
        answer[1] = '\0';
    }else {
        answer[0] = s[i / 2 - 1];
        answer[1] = s[i / 2];
        answer[2] = '\0';
    }

    return answer;
}