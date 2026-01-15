#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int food[], size_t food_len) {
    int len = 0;
    int idx = 0;
    
    for(int i = 1; i < food_len; i++){
        len += (food[i] / 2) * 2;
    }
    
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int j = 1; j < food_len; j++){
        for(int l = 0; l < food[j] / 2; l++){
            answer[idx++] = j + '0';
            answer[(len + 1) - idx] = j + '0';
        }
    }
    
    answer[idx] = '0';
    answer[len + 1] = '\0';
    
    return answer;
}