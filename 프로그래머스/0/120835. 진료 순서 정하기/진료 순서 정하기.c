#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int emergency[], size_t emergency_len) {
    int* answer = (int*)malloc(emergency_len * sizeof(int));

    for(int i = 0; i < emergency_len; i++){
        answer[i] = 1;
        for(int j = 0; j < emergency_len; j++){
            if(emergency[i] < emergency[j]) answer[i]++;
        }
    }
    
    return answer;
}