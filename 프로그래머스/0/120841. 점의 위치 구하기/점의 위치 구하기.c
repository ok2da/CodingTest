#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// dot_len은 배열 dot의 길이입니다.
int solution(int dot[], size_t dot_len) {
    int answer = 0;
    int x = dot[0], y = dot[1];
    
    if(x > 0){
        if(y > 0){
            answer = 1;
        }else {
            answer = 4;
        }
    }else {
        if(y > 0){
            answer = 2;
        }else {
            answer = 3;
        }
    }
    
    return answer;
}