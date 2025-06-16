#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int** queries, size_t queries_rows, size_t queries_cols) {

    int* answer = (int*)malloc(arr_len * sizeof(int));
    int s, e;
    
    for(int i = 0; i < arr_len; i++){
        answer[i] = arr[i];
    }
    
    for(int j = 0; j < queries_rows; j++){
        s = queries[j][0];
        e = queries[j][1];
        for(; s <= e; s++){
            answer[s]++;
        }
    }
    
    return answer;
}