#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char** solution(const char* strArr[], size_t strArr_len) {
    char** answer = (char**)malloc(strArr_len * sizeof(char*));
    int ad_check = 0;
    int idx = 0;
    
    for(int i = 0; i < strArr_len; i++){
        ad_check = 0;
        for(int j = 0; j < strlen(strArr[i]) - 1; j++){
            if(strArr[i][j] == 'a' && strArr[i][j + 1] == 'd'){
                ad_check++;
                break;
            }
        }
        if(!ad_check){
            answer[idx++] = strArr[i];
        }
    }
    
    return answer;
}