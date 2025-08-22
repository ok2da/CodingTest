#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int** score, size_t score_rows, size_t score_cols) {
    int* answer = (int*)malloc(score_rows * sizeof(int));
    int* avg = (int*)malloc(score_rows * sizeof(int));
    
    for(int i = 0; i < score_rows; i++){
        avg[i] = (score[i][0] + score[i][1]);
        answer[i] = avg[i];
    }
    
    for(int j = 0; j < score_rows - 1; j++){
        for(int k = j + 1; k < score_rows; k++){
            if(avg[j] < avg[k]){
                int temp = avg[j];
                avg[j] = avg[k];
                avg[k] = temp;
            }
        }
    }
    
    for(int l = 0; l < score_rows; l++){
        for(int m = 0; m < score_rows; m++){
            if(answer[l] == avg[m]){
                answer[l] = m + 1;
                break;
            }
        }
    }
    
    return answer;
}