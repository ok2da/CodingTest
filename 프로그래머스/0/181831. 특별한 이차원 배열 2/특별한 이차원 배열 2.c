#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int** arr, size_t arr_rows, size_t arr_cols) {
    int answer = 0;
    
    for(int i = 0; i < arr_rows; i++){
        for(int j = 0; j < arr_cols; j++){
            if(arr[i][j] != arr[j][i]) {
                return answer;
            }
        }
    }
    
    answer++;
    
    return answer;
}