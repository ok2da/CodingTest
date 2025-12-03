#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    int maxCount = 0;
    int maxValue = 0;
    int countArray[1000] = {0,};

    for(int i = 0; i < array_len; i++){
        countArray[array[i]]++;
        if(maxValue < array[i]){
            maxValue = array[i];
        }
    }
    
    for(int j = 0; j <= maxValue; j++){
        if(countArray[j] == 0) continue;
        
        if(maxCount < countArray[j]){
            maxCount = countArray[j];
            answer = j;
        }else if(maxCount == countArray[j]){
            answer = -1;
        }
    }
    
    return answer;
}