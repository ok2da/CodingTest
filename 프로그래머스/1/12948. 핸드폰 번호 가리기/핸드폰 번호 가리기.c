#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* phone_number) {
    size_t len = strlen(phone_number);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len - 4; i++){
        answer[i] = '*';
    }
    
    for(int j = len - 4; j < len; j++){
        answer[j] = phone_number[j];
    }
    
    answer[len] = '\0';
    
    return answer;
}