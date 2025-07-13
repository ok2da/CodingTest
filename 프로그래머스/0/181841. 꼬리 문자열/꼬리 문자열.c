#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* str_list[], size_t str_list_len, const char* ex) {
    char* answer = (char*)malloc(100 * sizeof(char));
    int idx = 0;
    
    for(int i = 0; i < str_list_len; i++){
        if(strstr(str_list[i], ex) == NULL){
            for(int j = 0; str_list[i][j] != '\0'; j++){
                answer[idx++] = str_list[i][j];
            }
        }
    }
    
    answer[idx] = '\0';
    
    return answer;
}