#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;

    for(int i = 1; i <= n; i++){
        answer = check(answer) + 1;
    }
    
    answer -= 1;
    
    return answer;
}

int check(int a){
    while(a % 3 == 0 || a % 10 == 3 || (a / 10) % 10 == 3){
        a++;
    }
    return a;
}