#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* my_string, int indices[], size_t indices_len) {
    int str_len = strlen(my_string);
    int str_idx = 0;
    char* answer = (char*)malloc(sizeof(char) * (str_len - indices_len) + 1);
    int* check = (int*)calloc(str_len, sizeof(int));
    
    for(int i = 0; i < indices_len; i++){
        check[indices[i]]++;
    }
    
    for(int j = 0; j < str_len; j++){
        if(check[j] == 0){
            answer[str_idx++] = my_string[j];
        }
    }
    
    answer[str_idx] = '\0';
    
    return answer;
}