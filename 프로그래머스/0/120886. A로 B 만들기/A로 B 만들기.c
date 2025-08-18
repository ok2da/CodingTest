#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* before, const char* after) {
    int answer = 1;
    int str[26] = {0, };
    int len = strlen(after);
    
    for(int i = 0; i < len; i++){
        str[before[i] - 97]++;
        str[after[i] - 97]--;
    }
    
    for(int j = 0; j < 26; j++){
        if(str[j] != 0){
            answer = 0;
            break;
        }
    }
    
    return answer;
}