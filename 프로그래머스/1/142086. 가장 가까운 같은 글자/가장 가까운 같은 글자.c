#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(const char* s) {
    int len = strlen(s);
    int* answer = (int*)malloc(len * sizeof(int));
    int* check = (int*)calloc(26, sizeof(int));
    int n;
    
    for(int i = 0; i < 26; i++) check[i] = -1;
    
    for(int i = 0; i < len; i++){
        n = s[i] - 97;
        if(check[n] == -1){
            check[n] = i;
            answer[i] = -1;
        }else {
            answer[i] = i - check[n];
            check[n] = i;
        }
    }
    
    return answer;
}