#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// ingredient_len은 배열 ingredient의 길이입니다.
int solution(int ingredient[], size_t ingredient_len) {
    int answer = 0;
    int stack[1000001] = {0};
    int idx = 0;
    
    for(int i = 0; i < ingredient_len; i++){
        stack[idx] = ingredient[i];
        if(idx >= 3 && stack[idx - 3] == 1 && stack[idx - 2] == 2 && stack[idx - 1] == 3 && stack[idx - 0] == 1){
            stack[idx] = 0;
            stack[idx - 1] = 0;
            stack[idx - 2] = 0;
            stack[idx - 3] = 0;
            idx -= 4;
            answer++;
        }
        idx++;
    }
    
    
    return answer;
}