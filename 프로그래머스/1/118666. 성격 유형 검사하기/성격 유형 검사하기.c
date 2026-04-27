#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// RT CF JM AN

char* solution(const char* survey[], size_t survey_len, int choices[], size_t choices_len) {
    char* answer = (char*)malloc(4 * sizeof(char));
    char* mbti = "RTCFJMAN";
    int category[8] = {0,};
    
    for(int i = 0; i < choices_len; i++){
        for(int j = 0; j < 8; j++){
            if(survey[i][1] == mbti[j]){
                category[j] += choices[i] - 4;
            }
        }
    }
    
    for(int k = 0; k < 8; k += 2){
        if(category[k] >= category[k + 1]){
            answer[k / 2] = mbti[k];
        }else {
            answer[k / 2] = mbti[k + 1];
        }
    }
    
    answer[4] = '\0';
    
    return answer;
}