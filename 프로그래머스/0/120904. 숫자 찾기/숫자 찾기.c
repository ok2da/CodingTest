#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num, int k) {
    int answer = 0;
    int cnt = 0;
    int idx = 0;
    
    while(num != 0){
        cnt++;
        if(num % 10 == k){
            idx = cnt;
        }
        num /= 10;
    }
    
    answer = idx != 0 ? cnt - idx + 1 : -1;
    
    return answer;
}