#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

int* solution(const char* intStrs[], size_t intStrs_len, int k, int s, int l) {
    int* answer = (int*)malloc(sizeof(int) * intStrs_len);
    int n = 0;
    int idx = 0;
    
    for(int i = 0; i < intStrs_len; i++){
        n = 0;
        
        for(int j = 0; j < l; j++){
            n = n * 10 + (intStrs[i][j + s] - '0');
        }
        
        if(n > k) answer[idx++] = n;
    }
    
    answer = realloc(answer, sizeof(int) * idx);
    
    return answer;
}