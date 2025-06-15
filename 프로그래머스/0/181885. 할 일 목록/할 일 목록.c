#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// todo_list_len은 배열 todo_list의 길이입니다.
// finished_len은 배열 finished의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char** solution(const char* todo_list[], size_t todo_list_len, bool finished[], size_t finished_len) {
    int idx = 0;
    char** answer = (char**)malloc(todo_list_len * sizeof(char*));
    
    for(int i = 0; i < finished_len; i++){
        if(!finished[i]) {
            answer[idx++] = todo_list[i];
        }
    }
    
    answer = (char**)realloc(answer, idx * sizeof(char*));
    
    return answer;
}