#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int pizza = 1;
    
    while(1){
        if(n * pizza % 6 != 0){
            pizza++;
        }else {
            answer = (n * pizza) / 6;
            break;
        }
    }
    
    return answer;
}