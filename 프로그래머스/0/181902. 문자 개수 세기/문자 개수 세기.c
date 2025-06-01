#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int* solution(const char* my_string) {
    int len = strlen(my_string);
    int* answer = (int*)calloc(52, sizeof(int));
    
    for(int i = 0; i < len; i++){
        if(my_string[i] < 97){
            answer[my_string[i] - 65]++;
        }else {
            answer[my_string[i] - 97 + 26]++;
        }
    }
    
    return answer;
}