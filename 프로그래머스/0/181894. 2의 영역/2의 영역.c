#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len) {
    int start = 0;
    int end = arr_len - 1;
    int idx = 0;
    int len = 0;
    
    for(; start < arr_len; start++){
        if(arr[start] == 2) break;
    }
    for(; end >= 0; end--){
        if(arr[end] == 2) break;
    }
    
    if(start > end) {
        len = 1;
    }else {
        len = end - start + 1;
    }

    int* answer = (int*)malloc(sizeof(int) * len);
    
    if(end < 0){
        answer[0] = -1;
    }else{
        for(; start <= end; start++){
            answer[idx++] = arr[start];
        }
    }
    
    return answer;
}