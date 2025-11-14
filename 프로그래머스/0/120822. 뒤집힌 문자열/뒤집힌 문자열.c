#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string) {
    size_t len = strlen(my_string);
    int cnt = 0;
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    while(*my_string){
        answer[len - 1 - cnt] = *my_string;
        cnt++;
        my_string++;
    }
    
    answer[len] = '\0';
    
    return answer;
}