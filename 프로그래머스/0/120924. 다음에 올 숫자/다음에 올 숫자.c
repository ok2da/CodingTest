#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// common_len은 배열 common의 길이입니다.
int solution(int common[], size_t common_len) {
    int answer = 0;
    
    if(common[2] - common[1] == common[1] - common[0]){
        answer = common[common_len - 1] + (common[1] - common[0]);
    }else {
        answer = common[common_len - 1] / common[1] * common[2];
    }
    
    return answer;
}