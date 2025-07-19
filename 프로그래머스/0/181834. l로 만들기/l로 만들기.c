#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* myString) {
    char* answer = (char*)malloc((strlen(myString) + 1) * sizeof(char));
    char* ptr = answer;
    
    while(*myString){
        if(*myString < 'l'){
            *ptr = 'l';
        }else {
            *ptr = *myString;
        }
        myString++;
        ptr++;
    }
    
    *ptr = '\0';
    
    return answer;
}