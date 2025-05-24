#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, int n) {
    int len = strlen(my_string);
    char* answer = (char*)malloc(len + 1);
    
    int idx = 0;
    
    for(int i = len - n; i <= len; i++){
        answer[idx++] = my_string[i];
    }
    
    answer[len] = '\0';

    return answer;
}