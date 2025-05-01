#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int number, int n, int m) {
    if (number % n + number % m == 0){
        return 1;
    }else {
        return 0;
    }
    
    return -1;
}