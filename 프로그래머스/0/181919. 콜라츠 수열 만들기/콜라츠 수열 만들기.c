#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int n) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(sizeof(int) * 1000);
    int idx = 0;
    
    answer[idx++] = n;
    
    while(n != 1){
        if(n % 2){
            n = 3 * n + 1;
        }else {
            n /= 2;
        }
        answer[idx++] = n;
    }
    
    return answer;
}