#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int array[], size_t array_len) {
    int* answer = (int*)calloc(2, sizeof(int));
    
    for(int i = 0; i < array_len; i++){
        if(array[i] > answer[0]){
            answer[0] = array[i];
            answer[1] = i;
        }
    }
    
    return answer;
}