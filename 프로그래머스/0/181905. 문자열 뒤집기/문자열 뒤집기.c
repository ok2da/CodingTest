#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, int s, int e) {
    int len = strlen(my_string);
    int idx = 0;
    char* answer = (char*)malloc(sizeof(char) * len + 1);
    strcpy(answer, my_string);
    
    while(1){
        if(e - idx < s) break;
        answer[s + idx] = my_string[e - idx];
        idx++;
    }
    
    return answer;
}