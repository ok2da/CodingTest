#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* n_str) {
    int answer = 0;
    
    while(*n_str){
        answer *= 10;
        answer += *n_str - '0';
        n_str++;
    }
    return answer;
}