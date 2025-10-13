#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int** solution(int num_list[], size_t num_list_len, int n) {
    size_t answer_len = num_list_len / 2;
    int** answer = (int**)malloc(answer_len * sizeof(int*));
    
    for(int i = 0; i < answer_len; i++){
        answer[i] = (int*)malloc(n * sizeof(int));
        for(int j = 0; j < n; j++){
            answer[i][j] = num_list[i * n + j];
        }
    }
    
    return answer;
}