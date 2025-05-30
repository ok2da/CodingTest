#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, int m, int c) {
    int len = strlen(my_string) / m;
    int idx = 1;
    char* answer = (char*)malloc(sizeof(char) * len + 1);
    
    
    for(int i = 0; i < len; i++){
        answer[i] = my_string[(i * m) + c - 1];
    }
    
    answer[len] = '\0';
    
    return answer;
}