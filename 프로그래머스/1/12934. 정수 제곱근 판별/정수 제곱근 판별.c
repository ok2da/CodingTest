#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

long long solution(long long n) {
    long long answer = 0;
    long long t = sqrt(n);
        
    if(t * t != n){
        answer = -1;
    }else {
        answer = (t + 1) * (t + 1);
    }
    
    return answer;
}