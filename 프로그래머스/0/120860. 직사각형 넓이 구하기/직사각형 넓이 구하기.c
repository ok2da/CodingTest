#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int** dots, size_t dots_rows, size_t dots_cols) {
    int answer = 0;
    
    int x = max(abs(dots[0][0] - dots[1][0]), abs(dots[1][0] - dots[2][0]));
    int y = max(abs(dots[0][1] - dots[1][1]), abs(dots[1][1] - dots[2][1]));
        
    answer = x * y;
    
    return answer;
}

int max(int a, int b){
    return a > b ? a : b;
}