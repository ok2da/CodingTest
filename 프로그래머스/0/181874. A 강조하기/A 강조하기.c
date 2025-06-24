#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* myString) {
    int len = strlen(myString);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        char c = myString[i];
        if(c >= 97 || c == 32){
            if(c == 'a'){
                answer[i] = c - 32;
            }else {
                answer[i] = c;
            }
        }else {
            if(c == 'A'){
                answer[i] = c;
            }else {
                answer[i] = c + 32;
            }
        }

    }
    
    answer[len] = '\0';
    
    return answer;
}