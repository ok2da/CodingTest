#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string) {
    char* temp = (char*)malloc(strlen(my_string) * sizeof(char));
    char* answer;
    int idx = 0;
    
    while(*my_string){
        switch(*my_string){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                break;
            default:
                temp[idx++] = *my_string;
        }
        my_string++;
    }
    
    temp[idx] = '\0';
    
    if(idx != 0){
        answer = realloc(temp, idx);
    }else {
        answer = realloc(temp, idx + 1);
    }
    
    return answer;
}