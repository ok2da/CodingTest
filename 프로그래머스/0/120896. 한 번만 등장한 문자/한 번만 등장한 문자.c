#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* s) {
    int str[26] = {0, };
    int idx = 0;
    char* answer = (char*)malloc(32 * sizeof(char));
    
    while(*s){
        str[*s - 97]++;
        s++;
    }
    
    for(int i = 0; i < 26; i++){
        if(str[i] == 1){
            answer[idx++] = 97 + i;
        }
    }
    
    answer[idx] = '\0';
    
    answer = realloc(answer, idx + 1);
    
    return answer;
}