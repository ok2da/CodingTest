#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int** intervals, size_t intervals_rows, size_t intervals_cols) {
    int len = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
    int* answer = (int*)malloc(sizeof(int) * len);
    int a, b;
    int idx = 0;
    
    for(int i = 0; i < intervals_rows; i++){
        a = intervals[i][0];
        b = intervals[i][1];
        for(; a <= b; a++){
            answer[idx++] = arr[a];
        }
    }
    
    return answer;
}