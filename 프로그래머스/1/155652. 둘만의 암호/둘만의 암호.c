#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* s, const char* skip, int index) {
    int len = strlen(s);
    bool skipIdx[26] = {false};
    int countIdx = 0;
    int check = 0;
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    answer[len] = '\0';
    
    for(int i = 0; i < strlen(skip); i++){
        skipIdx[skip[i] - 'a'] = true;
    }
    
    for(int j = 0; j < len; j++){
        countIdx = index;
        check = s[j] - 'a';
        while(countIdx--){
            check = (check + 1) % 26;
            if(skipIdx[check]) countIdx++;
        }
        answer[j] = 'a' + check;
    }
    
    return answer;
}