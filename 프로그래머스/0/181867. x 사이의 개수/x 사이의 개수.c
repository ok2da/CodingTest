#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(const char* myString) {
    int len = 0;
    int idx = 0;
    
    for(int i = 0; myString[i] != '\0'; i++) {
        if(myString[i] == 'x') len++;
    }

    int* answer = (int*)calloc((len + 1), sizeof(int)); 
    
    while(*myString){
        if(*myString == 'x') {
            idx++;
        }else {
            answer[idx]++;
        }
        myString++;
    }
    
    return answer;
}