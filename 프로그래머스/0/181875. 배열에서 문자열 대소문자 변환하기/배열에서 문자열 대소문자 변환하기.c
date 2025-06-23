#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char** solution(const char* strArr[], size_t strArr_len) {
    char** answer = (char**)malloc(strArr_len * sizeof(char*));
    
    for(int i = 0; i < strArr_len; i++){
        const char* str = strArr[i];
        size_t str_len = strlen(str);
        
        answer[i] = (char*)malloc((str_len + 1) * sizeof(char));
        
        for(int j = 0; j < str_len; j++){
            if(str[j] >= 97){
                if(i % 2 == 0){
                    answer[i][j] = str[j];
                }else {
                    answer[i][j] = str[j] - 32;
                }
            }else {
                if(i % 2 == 0){
                    answer[i][j] = str[j] + 32;
                }else {
                    answer[i][j] = str[j];
                }
            }
        }
        answer[i][str_len] = '\0';
    }
    
    return answer;
}