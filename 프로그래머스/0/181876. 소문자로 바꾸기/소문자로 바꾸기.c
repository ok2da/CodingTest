#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* myString) {
    int len = strlen(myString);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if(myString[i] >= 97){
            answer[i] = myString[i];
        }else {
            answer[i] = myString[i] + 32;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}