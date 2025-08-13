#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
long long solution(const char* numbers) {
    long long answer = 0;
    char* num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    size_t len = 10;
    char number[6] = {0};
    int idx = 0;
    
    while(*numbers){
        number[idx++] = *numbers;
        
        if(idx >= 3){
            for(int i = 0; i < len; i++){
                if(strcmp(number, num[i]) == 0){
                    idx = 0;
                    answer = answer * 10 + i;
                    memset(number, 0, sizeof(number));
                    break;
                }
            }
        }
        numbers++;
    }
    
    return answer;
}