#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string, const char* overwrite_string, int s) {
    
    int len = strlen(my_string);
    char* answer = (char*)malloc(len + 1);
    
    for(int i = 0; i < strlen(my_string); i++){
        if(i < s){
            printf("%d", 1);
            answer[i] = my_string[i];
        }else if(i < strlen(overwrite_string) + s){
            printf("%d", 2);
            answer[i] = overwrite_string[i - s];
        }else {
            printf("%d", 3);
            answer[i] = my_string[i];
        }
    }
    
    answer[len] = '\0';


    return answer;
}