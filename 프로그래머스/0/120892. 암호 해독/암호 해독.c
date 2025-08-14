#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* cipher, int code) {
    size_t len = strlen(cipher);
    int idx = 0;
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if((i + 1) % code == 0){
            answer[idx++] = cipher[i];
        }
    }
    
    answer[idx] = '\0';
    
    return answer;
}