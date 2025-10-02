#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int m = 0, nm = 0;
    
    for(int i = 0; i < numbers_len; i++){
        if(m < numbers[i]){
            nm = m;
            m = numbers[i];
        }else if(nm < numbers[i]){
            nm = numbers[i];
        }
    }
    
    answer = m * nm;
    
    return answer;
}