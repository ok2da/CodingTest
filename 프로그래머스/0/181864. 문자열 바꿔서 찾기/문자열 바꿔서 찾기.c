#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* myString, const char* pat) {
    int answer = 0;
    int pat_len = strlen(pat);
    int idx = 0;
    
    while(*myString){
        if(*myString != pat[idx]){
            idx++;
            if(idx == pat_len) return ++answer;
        }else {
            idx = 0;
        }
        myString++;
    }
    
    return answer;
}