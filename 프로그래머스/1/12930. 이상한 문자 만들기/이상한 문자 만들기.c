#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* s) {
    size_t len = strlen(s);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    int idx = 0;
    
    for(int i = 0; i < len; i++){
        if(s[i] == ' '){
            answer[i] = ' ';
            idx = 0;
        }else {
            if(idx % 2){
                answer[i] = (s[i] >= 'A' && s[i] <= 'Z') ? s[i] + 32 : s[i];
            }else {
                answer[i] = (s[i] >= 'a' && s[i] <= 'z')  ? s[i] - 32 : s[i];
            }
            idx++;
        }
    }
    
    answer[len] = '\0';
    
    return answer;
}