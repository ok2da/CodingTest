#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* n_str) {
    
    while(*n_str){
        if(*n_str != '0') break;
        n_str++;
    }
    
    char* answer = n_str;
    
    return answer;
}