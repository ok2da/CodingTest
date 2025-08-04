#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* str1, const char* str2) {
    int answer = 0;
    int len = strlen(str2);
    int idx = 0;
    
    while(*str1 != '\0'){
        
        if(*str1 == str2[idx]){
            idx++;
            answer += 1;
        }else {
            idx = 0;
            answer = 0;
        }
        if(answer == len){
            return answer = 1;
            break;
        }
        str1++;
    }
    
    answer = 2;
    
    return answer;
}