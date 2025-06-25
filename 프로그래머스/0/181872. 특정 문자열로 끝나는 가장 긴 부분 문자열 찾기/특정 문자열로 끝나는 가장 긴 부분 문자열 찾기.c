#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* myString, const char* pat) {
    int str_idx = strlen(myString);
    int pat_idx = strlen(pat) - 1;
    int len = pat_idx;
    
    while(str_idx--){
        if(myString[str_idx] == pat[pat_idx]) pat_idx--;
        if(pat_idx == -1) break;
    }
    
    len += str_idx;
    
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i <= len; i++){
        answer[i] = myString[i];
    }
    
    answer[len + 1] = '\0';
    
    return answer;
}