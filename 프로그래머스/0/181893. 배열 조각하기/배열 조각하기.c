#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int query[], size_t query_len) {
    int start = 0;
    int end = arr_len - 1;
    int len = 0;
    int idx = 0;
    
    for(int i = 0; i < query_len; i++){
        if(i % 2 == 0){
            end = query[i];
            end += start;
        }else {
            start += query[i];
        }
    }
    
    len = end - start + 1;

    int* answer = (int*)malloc(sizeof(int) * len);
    
    for(; start <= end; start++){
        answer[idx++] = arr[start];
    }
    
    
    return answer;
}