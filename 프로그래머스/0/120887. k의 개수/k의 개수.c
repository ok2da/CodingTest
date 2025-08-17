#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int i, int j, int k) {
    int answer = 0;
    
    for(; i <= j; i++){
        int n = i;
        while(n != 0){
            if(n % 10 == k) answer++;
            n /= 10;
        }
    }
    return answer;
}