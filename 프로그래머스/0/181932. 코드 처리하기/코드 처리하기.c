#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* code) {
    char* answer = (char*)malloc(100001);
    bool mode = false;
    int index = 0;
    
    for(int i = 0; code[i] != '\0'; i++){
        if(code[i] == '1'){             // mode 변경
            mode = mode ? false : true;
            continue;
        }
        if(!mode && i % 2 == 0) {       // 짝수 확인
            answer[index++] = code[i];
            continue;
        }
        if(mode && i % 2 == 1){         // 홀수 확인
            answer[index++] = code[i];
            continue;
        }
    }
    
    if(index){
        answer[index] = '\0';
    }else {
        answer = "EMPTY";
    }

    return answer;
}