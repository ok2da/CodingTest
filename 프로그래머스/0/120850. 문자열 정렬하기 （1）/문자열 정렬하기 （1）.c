#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* sorted(void *a, void *b){
    return (*(int*)a - *(int*)b);
}

int* solution(const char* my_string) {
    int* answer = (int*)malloc(strlen(my_string) * sizeof(int));
    int idx = 0;
    
    while(*my_string){
        if(*my_string >= '0' && *my_string <= '9'){
            answer[idx++] = *my_string - '0';
        }
        my_string++;
    }
    
    qsort(answer, idx, sizeof(int), sorted);
    
    
    return answer;
}