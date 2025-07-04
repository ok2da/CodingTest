#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len) {
    int len = 0;
    int idx = 0;
    
    for(int i = 0; i < arr_len; i++){
        len += arr[i];
    }
    
    int* answer = (int*)malloc(len * sizeof(int));
    
    for(int j = 0; j < arr_len; j++){
        int n = arr[j];
        for(int k = 0; k < n; k++){
            answer[k + idx] = n;
        }
        idx += n;
    }
    
    return answer;
}