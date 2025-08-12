#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string) {
    size_t len = strlen(my_string);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if(my_string[i] >= 97){
            answer[i] = my_string[i] - 32;
        }else {
            answer[i] = my_string[i] + 32;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}