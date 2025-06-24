#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string, const char* alp) {
    int len = strlen(my_string);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        char c = my_string[i];
        if(c == alp[0]){
            answer[i] = c - 32;
        }else {
            answer[i] = c;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}