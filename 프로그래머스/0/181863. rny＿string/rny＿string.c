#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int m_count(const char* str){
    int cnt = 0;
    while(*str){
        if(*str == 'm') cnt++;
        str++;
    }
    
    return cnt;
}

char* solution(const char* rny_string) {
    int m_length = m_count(rny_string);
    int str_length = strlen(rny_string);
    int ans_length = m_length + str_length;
    int idx = 0;
    char* answer = (char*)malloc((ans_length + 1) * sizeof(char));
    
    for(int i = 0; i < str_length; i++){
        if(rny_string[i] == 'm'){
            answer[idx++] = 'r';
            answer[idx++] = 'n';
        }else {
            answer[idx++] = rny_string[i];
        }
    }
    
    answer[ans_length] = '\0';
    
    return answer;
}