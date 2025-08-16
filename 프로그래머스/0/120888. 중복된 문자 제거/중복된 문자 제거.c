#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string) {
    size_t len = strlen(my_string);
    int str[128] = {0,};
    int idx = 0;
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if(!str[my_string[i]]){
            answer[idx++] = my_string[i];
            str[my_string[i]]++;
        }
    }
    
    answer[idx] = '\0';
    
    return answer;
}