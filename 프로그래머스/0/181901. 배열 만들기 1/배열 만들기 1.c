#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n, int k) {
    int len = n / k;
    int* answer = (int*)malloc(sizeof(int) * len + 1);
    
    for(int i = 0; i < len; i++){
        answer[i] = k * (i + 1);
    }
    
    return answer;
}