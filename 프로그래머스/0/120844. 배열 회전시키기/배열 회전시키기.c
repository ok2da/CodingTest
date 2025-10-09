#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

int* solution(int numbers[], size_t numbers_len, const char* direction) {
    int* answer = (int*)malloc(numbers_len * sizeof(int));
    int idx = 0;
    
    if(!strcmp(direction, "right")){
        answer[idx++] = numbers[numbers_len - 1];
        for(int i = 0; i < numbers_len - 1; i++){
            answer[idx++] = numbers[i];
        }
    }else {
        answer[numbers_len - 1] = numbers[0];
        for(int j = 1; j < numbers_len; j++){
            answer[idx++] = numbers[j];
        }
    }
    
    return answer;
}