#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    int answer = 0;
    
    if(a % 2 && b % 2) {
        answer = (a * a) + (b * b);
    }else if(a % 2 || b % 2) {
        answer = 2 * (a + b);
    }else {
        answer = a > b ? a - b : b - a;
    }
    
    
    return answer;
}