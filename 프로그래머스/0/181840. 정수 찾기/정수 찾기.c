#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num_list[], size_t num_list_len, int n) {
    int answer = 0;
    
    for(int i = 0; i < num_list_len; i++){
        if(num_list[i] == n) {
            answer = 1;
            break;
        }
    }
    
    return answer;
}