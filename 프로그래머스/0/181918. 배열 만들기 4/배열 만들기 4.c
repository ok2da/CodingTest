#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int* solution(int arr[], size_t arr_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* stk = (int*)malloc(sizeof(int) * arr_len);
    int stkidx = 0, arridx = 0;
    
    while(1){
        if(arridx == arr_len) break;
        
        if(stkidx == 0){
            stk[stkidx++] = arr[arridx++];
        }else if(stk[stkidx - 1] < arr[arridx]){
            stk[stkidx++] = arr[arridx++];
        }else if(stk[stkidx - 1] >= arr[arridx]){
            stk[stkidx--] = NULL;
        }
    }
    
    return stk;
}