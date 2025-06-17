#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int solution(int arr[], size_t arr_len) {
    int answer = 0;
    int count = 0;
    
    while(1){
        count = 0;
        for(int i = 0; i < arr_len; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arr[i] /= 2;
            }else if(arr[i] < 50 && arr[i] % 2 != 0){
                arr[i] *= 2;
                arr[i] += 1;
            }else {
                count++;
            }
        }
        
        if(count == arr_len){
            return answer;
        }else {
            answer++;
        }
    }
    
    return -1;
}