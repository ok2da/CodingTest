#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len, int n) {
    int answer = 0;
    int diff = 101;
    
    for(int i = 0; i < array_len; i++){
        if(abs(array[i] - n) < diff){
            answer = array[i];
            diff = abs(array[i] - n);
        }else if(abs(array[i] - n) == diff){
            answer = array[i] < answer ? array[i] : answer;
        }
    }
    
    return answer;
}