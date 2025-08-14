#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* cipher, int code) {
    size_t len = strlen(cipher);
    int idx = 0;
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = code - 1; i <= len; i += code){
        answer[idx++] = cipher[i];
    }
    
    answer[idx] = '\0';
    
    return answer;
}