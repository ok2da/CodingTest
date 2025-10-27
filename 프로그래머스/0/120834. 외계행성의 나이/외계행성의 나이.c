#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int age) {
    int len = 0;
    int temp_age = age;
    
    while(temp_age > 0){
        len++;
        temp_age /= 10;
    }
    
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    char* temp = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        temp[i] = (age % 10) + 'a';
        age /= 10;
    }
    
    for(int j = 0; j < len; j++){
        answer[j] = temp[len - j - 1];
    }
    
    answer[len] = '\0';
    
    return answer;
}