#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int count = 0;
    
    for(int i = 1; i <= n; i++){
        count = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0) {
                count++;
            }
            if(count == 3) {
                answer++;
                break;
            }
        }
    }
    
    return answer;
}