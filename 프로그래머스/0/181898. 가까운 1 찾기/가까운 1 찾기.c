#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int solution(int arr[], size_t arr_len, int idx) {
    int answer = -1;
    
    for(; idx < arr_len; idx++){
        if(arr[idx] == 1){
            return idx;
        }
    }
    
    return answer;
}