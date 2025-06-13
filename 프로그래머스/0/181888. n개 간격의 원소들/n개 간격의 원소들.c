#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len, int n) {
    int len = num_list_len / n + 1;
    int* answer = (int*)malloc(sizeof(int) * len);

    for(int i = 0; i < len; i++){
        answer[i] = num_list[i * n];
    }
    
    return answer;
}