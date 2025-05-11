#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int numLog[], size_t numLog_len) {

    char* answer = (char*)malloc(numLog_len);
    int index = 0;
    
    for(int i = 0; i < numLog_len - 1; i++){
        if(numLog[i] + 1 == numLog[i + 1]){
            answer[index++] = 'w';
        }else if(numLog[i] - 1 == numLog[i + 1]){
            answer[index++] = 's';
        }else if(numLog[i] + 10 == numLog[i + 1]){
            answer[index++] = 'd';
        }else if(numLog[i] - 10 == numLog[i + 1]){
            answer[index++] = 'a';
        }
    }
    
    answer[numLog_len - 1] = '\0';
    
    return answer;
}