#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len, bool flag[], size_t flag_len) {
    int* answer = (int*)malloc(10000 * sizeof(int));
    int idx = 0;
    int len = 0;
    
    for(int i = 0; i < flag_len; i++){
        int num = arr[i];
        if(flag[i]){
            len = num * 2;
            while(len--) answer[idx++] = num;
        }else {
            idx -= num;
        }
    }
    
    answer = realloc(answer, idx * sizeof(int));
    
    return answer;
}