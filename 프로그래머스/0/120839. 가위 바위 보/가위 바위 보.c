#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* rsp) {
    size_t len = strlen(rsp);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if(rsp[i] == '2') {
            answer[i] = '0';
            continue;
        }
        if(rsp[i] == '0') {
            answer[i] = '5';
            continue;
        }
        if(rsp[i] == '5') {
            answer[i] = '2';
            continue;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}