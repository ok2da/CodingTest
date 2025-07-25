#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, int k) {
    int flag[100001] = {0}; 
    int* answer = (int*)malloc(k * sizeof(int));
    int idx = 0;
    
    for(int i = 0; i < arr_len; i++){
        if(flag[arr[i]] == 1) continue;
        if(idx == k) break;
        
        answer[idx++] = arr[i];
        flag[arr[i]] = 1;
    }
    
    if(idx < k){
        for(; idx < k; idx++){
            answer[idx] = -1;
        }
    }
    
    return answer;
}