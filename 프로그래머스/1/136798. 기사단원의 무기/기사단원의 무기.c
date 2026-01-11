#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

int solution(int number, int limit, int power) {
    int answer = 0;

    for(int i = 1; i <= number; i++){
        int weapon = 0;

        for(int j = 1; j <= (int) sqrt(i); j++){
            if(i % j == 0) weapon += 2;
            if(j * j == i) weapon -= 1;
        }

        if(limit < weapon) {
            answer += power;
        }else {
            answer += weapon;
        }
        
    }

    return answer;
}