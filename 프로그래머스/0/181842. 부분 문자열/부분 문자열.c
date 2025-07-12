#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* str1, const char* str2) {
    int answer = -1;
    
    if(strstr(str2, str1) != NULL){
        answer = 1;
    }else {
        answer = 0;
    }
    
    return answer;
}