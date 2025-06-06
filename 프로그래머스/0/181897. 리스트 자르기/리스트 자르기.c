#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// slicer_len은 배열 slicer의 길이입니다.
// num_list_len은 배열 num_list의 길이입니다.
int* solution(int n, int slicer[], size_t slicer_len, int num_list[], size_t num_list_len) {
    int a, b, c;
    int len;
    int idx = 0;
    
    if(n == 1) {
        a = 0;
        b = slicer[1];
        c = -1;
        len = b + 1;
    }else if(n == 2) {
        a = slicer[0];
        b = num_list_len;
        c = -1;
        len = b - a;
    }else if(n == 3) {
        a = slicer[0];
        b = slicer[1];
        c = -1;
        len = b - a + 1;
    }else {
        a = slicer[0];
        b = slicer[1];
        c = slicer[2];
        len = (a + b) / c;
    }
    
    int* answer = (int*)malloc(sizeof(int) * len);
    
    for(; a <= b;){
        answer[idx++] = num_list[a];
        if(c > 0){
            a += c;
        }else {
            a++;
        }
    }
    
    return answer;
}