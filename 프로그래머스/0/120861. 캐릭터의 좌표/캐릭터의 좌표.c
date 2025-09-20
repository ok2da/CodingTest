#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(const char* keyinput[], size_t keyinput_len, int board[], size_t board_len) {
    int* answer = (int*)malloc(sizeof(int) * 2);
    answer[0] = 0;
    answer[1] = 0;
    int x = board[0] / 2;
    int y = board[1] / 2;
    
    for(int i = 0; i < keyinput_len; i++){
        if(strcmp(keyinput[i], "up") == 0){
            if(answer[1] < y){
                answer[1]++;
            }
        }
        if(strcmp(keyinput[i], "down") == 0){
            if(answer[1] > -y){
                answer[1]--;
            }
        }
        if(strcmp(keyinput[i], "left") == 0){
            if(answer[0] > -x){
                answer[0]--;
            }
        }
        if(strcmp(keyinput[i], "right") == 0){
            if(answer[0] < x){
                answer[0]++;
            }
        }
    }
    
    return answer;
}