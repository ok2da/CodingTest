#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int delete_list[], size_t delete_list_len) {
    
    int* answer = (int*)malloc(arr_len * sizeof(int));
    int delete_arr[1001] = {0};
    int idx = 0;

    for(int i = 0; i < delete_list_len; i++){
        delete_arr[delete_list[i]]++;
    }
    
    for(int j = 0; j < arr_len; j++){
        if(delete_arr[arr[j]] == 0){
            answer[idx++] = arr[j];
        }
    }
    
    return answer;
}