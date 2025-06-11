#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len, int n) {
	int* answer = (int*)malloc(sizeof(int) * (num_list_len - n + 1));
    int answer_idx = 0;
    int list_idx = n - 1;
    
    for(; list_idx < num_list_len; list_idx++){
        answer[answer_idx++] = num_list[list_idx];
    }
    
    return answer;
}