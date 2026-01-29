#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// number_len은 배열 number의 길이입니다.
int solution(int number[], size_t number_len) {
    int answer = 0;
    
    for(int i = 0; i < number_len - 2; i++){
        for(int j = i + 1; j < number_len - 1; j++){
            for(int l = j + 1; l < number_len; l++){
                if(number[i] + number[j] + number[l] == 0) answer++;
            }
        }
    }
    
    return answer;
}