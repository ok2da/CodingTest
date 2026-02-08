#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* s) {
    int answer = 0;
    char *number[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    while(*s) {
        if(*s >= '0' && *s <= '9'){
            answer *= 10;
            answer += *s - '0';
            s++;
        }else {
            for(int i = 0; i < 10; i++){
                if(strncmp(s, number[i], strlen(number[i])) == 0){
                    answer *= 10;
                    answer += i;
                    s += strlen(number[i]);
                    break;
                }
            }
            continue;
        }
    }
    
    return answer;
}