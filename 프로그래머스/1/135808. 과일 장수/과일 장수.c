#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int*)b - *(int*)a);
}

int solution(int k, int m, int score[], size_t score_len) {
    int answer = 0;
    int box = score_len / m;
    
    qsort(score, score_len, sizeof(int), compare);
    
    for(int i = 0; i < box; i ++){
        answer += score[(i + 1) * m - 1] * m;
    }
    
    
    return answer;
}