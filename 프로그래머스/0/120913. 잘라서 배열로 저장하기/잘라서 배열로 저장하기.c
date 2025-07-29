#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char** solution(const char* my_str, int n) {
    int len = (strlen(my_str) + n - 1) / n;
    int idx = 0;
    char** answer = (char**)malloc(len * sizeof(char*));
    
    for(int i = 0; i < len; i++){
        answer[i] = (char*)malloc(n * sizeof(char));
        idx = 0;
        
        while(*my_str != '\0' && idx < n){
            answer[i][idx++] = *my_str;
            my_str++;
        }
        answer[i][idx] = '\0';
    }
    
    return answer;
}