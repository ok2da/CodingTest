#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int** solution(int n) {
    int** answer = (int**)malloc(n * sizeof(int*));
    
    for(int i = 0; i < n; i++){
        answer[i] = (int*)calloc(n, sizeof(int));
        answer[i][i] = 1;
    }
    
    return answer;
}