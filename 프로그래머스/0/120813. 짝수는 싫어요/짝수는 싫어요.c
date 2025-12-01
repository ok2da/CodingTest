#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    int len = n % 2 == 0 ? n / 2 : n / 2 + 1;
    int* answer = (int*)malloc(len * sizeof(int));
    
    for(int i = 0; i < len; i++){
        answer[i] = i * 2 + 1;
    }
    
    return answer;
}