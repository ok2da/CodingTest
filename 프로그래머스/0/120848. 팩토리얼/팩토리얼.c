#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int temp = 1;
    
    while(temp <= n){
        answer++;
        temp *= answer;
    }
    
    answer--;
    
    return answer;
}