#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int a, int b) {
    int answer = 0;

    int ab = cal(a,b);
    int ba = cal(b,a);
    
    if(ab >= ba){
        answer = ab;
    }else {
        answer = ba;
    }
    
    printf("%d,%d",ab,ba);

    return answer;
}

int cal(int e1, int e2) {   
    int len = 0;
    int temp = e2;
    
    while(temp > 0) {
        temp /= 10;
        len++;
    }

    return e1 * (int) pow(10, len) + e2;
}