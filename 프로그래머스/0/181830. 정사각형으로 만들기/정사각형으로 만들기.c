#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int** solution(int** arr, size_t arr_rows, size_t arr_cols) {
    size_t max_size = arr_rows > arr_cols ? arr_rows : arr_cols;
    
    int** answer = (int**)malloc(max_size * sizeof(int*));
    
    for(int i = 0; i < max_size; i++){
        answer[i] = (int*)calloc(max_size, sizeof(int));
    }
    
    for(int j = 0; j < arr_rows; j++){
        for(int l = 0; l < arr_cols; l++){
            answer[j][l] = arr[j][l];
        }
    }
    
    return answer;
}