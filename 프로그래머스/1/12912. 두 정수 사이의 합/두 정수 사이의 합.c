#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    
    int max = a > b ? a : b;
    int min = a > b ? b : a;
    
    for(int i = min; i <= max; i++){
        answer += i;
    }
    
    return answer;
}