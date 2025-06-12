#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len, int n) {
    int* answer = (int*)malloc(sizeof(int) * num_list_len);
    int idx = 0;
    
    for(int i = n; i < num_list_len; i++){
        answer[idx++] = num_list[i];
    }
    
    for(int j = 0; j < n; j++){
        answer[idx++] = num_list[j];
    }
    
    return answer;
}