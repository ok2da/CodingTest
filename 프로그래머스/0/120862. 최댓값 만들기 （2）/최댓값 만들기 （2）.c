#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(const void *e1, const void *e2){
    return (*(int *)e1 - *(int *)e2);
}

int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int a = 0, b = 0;
    
    qsort(numbers, numbers_len, sizeof(int), compare);
    
    // a = 작은수 or 음수 , b = 큰수 or 양수
    a = numbers[0] * numbers[1];
    b = numbers[numbers_len - 1] * numbers[numbers_len - 2];

    answer = a > b ? a : b;
    
    return answer;
}