#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len, int num1, int num2) {
    int len = num2 - num1 + 1;
    int* answer = (int*)malloc(len * sizeof(int));
    
    for(int i = num1; i <= num2; i++){
        answer[i - num1] = numbers[i];
    }
    
    return answer;
}