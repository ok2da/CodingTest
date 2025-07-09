#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int getLength(int n){
    int count = 0;
    
    while(n != 0){
        count++;
        n = n / 10;
    }
    return count;
}

char* solution(int n) {
    int len = getLength(n);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = len - 1; i >= 0; i--){
        answer[i] = n % 10 + '0';
        n /= 10;
    }
    
    answer[len] = '\0';
    
    return answer;
}