#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len, int n) {
    int* answer = (int*)malloc(sizeof(int) * n);
    
    memcpy(answer, num_list, sizeof(int) * n);
    
    return answer;
}