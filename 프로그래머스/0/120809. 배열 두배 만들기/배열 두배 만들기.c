#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len) {
    int* answer = (int*)malloc(numbers_len * sizeof(int));
    
    for(int i = 0; i < numbers_len; i++){
        answer[i] = numbers[i] * 2;
    }
    
    return answer;
}