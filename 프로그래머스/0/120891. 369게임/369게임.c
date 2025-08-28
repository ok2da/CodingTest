#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int order) {
    int answer = 0;
    
    while(order){
        int temp = order % 10;
        if(temp == 3 || temp == 6 || temp == 9) {
            answer++;
        }
        order /= 10;
    }
    
    return answer;
}