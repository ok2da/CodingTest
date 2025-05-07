#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int product = 1;
    int square = 0;
    
    for(int i = 0; i < num_list_len; i++){
        product *= num_list[i];
        square += num_list[i];
    }
    
    if(product < square * square){
        return 1;
    }else {
        return 0;
    }
    
    return -1;
}