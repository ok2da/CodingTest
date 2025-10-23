#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    for(int i = 1; i <= n; i++){
        answer += n % i == 0 ? 1 : 0;
    }
    
    return answer;
}