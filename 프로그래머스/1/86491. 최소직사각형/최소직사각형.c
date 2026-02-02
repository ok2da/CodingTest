#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int** sizes, size_t sizes_rows, size_t sizes_cols) {
    int answer = 0;
    int w = 0;
    int h = 0;
    
    for(int i = 0; i < sizes_rows; i++){
        int card_w = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1]; // 큰 길이
        int card_h = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0]; // 작은 길이
        
        if(card_w > w) w = card_w;
        if(card_h > h) h = card_h;
    }
    
    answer = w * h;
    
    return answer;
}