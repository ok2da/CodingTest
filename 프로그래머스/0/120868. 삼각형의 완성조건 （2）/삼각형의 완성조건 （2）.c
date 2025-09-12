#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 0;
        
    int a = sides[0] > sides[1] ? sides[0] : sides[1];
    int b = sides[0] < sides[1] ? sides[0] : sides[1];

    int m = a - b;
    int p = a + b;
        
    for(int i = m + 1; i < p; i++){
        int c = i;
        if(a + b > c && a + c > b && b + c > a) answer++;
    }

    return answer;
}