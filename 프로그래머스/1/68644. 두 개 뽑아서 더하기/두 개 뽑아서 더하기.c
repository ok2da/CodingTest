#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len) {
    int* answer;
    int* sum = (int*)calloc(200, sizeof(int));
    int temp = 0, low = 101, high = 0, cnt = 0, idx = 0;
    
    for(int i = 0; i < numbers_len - 1; i++){
        for(int j = i + 1; j < numbers_len; j++){
            temp = numbers[i] + numbers[j];
            sum[temp]++;
            cnt++;
            if(temp < low) low = temp;
            if(temp > high) high = temp;
        }
    }
    
    answer = (int*)malloc(cnt * sizeof(int));
    
    for(int l = low; l <= high; l++){
        if(sum[l] != 0) answer[idx++] = l;
    }
    
    
    
    return answer;
}