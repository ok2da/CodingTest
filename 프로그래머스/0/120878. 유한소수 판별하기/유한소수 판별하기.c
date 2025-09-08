#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    int answer = 0;
    
    while(1){
        if(b % 5 == 0) {
            b /= 5;
        }else if(b % 2 == 0) {
            b /= 2;
        }else {
            break;
        }
    }
    
    if(a % b == 0){
        answer = 1;
    }else {
        answer = 2;
    }
    
    return answer;
}