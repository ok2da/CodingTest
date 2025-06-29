#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int get_Split_X_Count(const char* str){
    int count = 0;
    int check = 0;
    while(*str){
        if(*str != 'x') {
            if(check == 0){
                count++;
                check = 1;
            }
        }else {
            check = 0;
        }
        str++;
    }
    return count;
}

char** bubble_sort(char** arr, int len){
    for(int k = 0; k < len - 1; k++){
        for(int l = 0; l < len - k - 1; l++){
            char* a = arr[l];
            char* b = arr[l + 1];
            if(strcmp(a, b) > 0){
                arr[l] = b;
                arr[l + 1] = a;
            }
        }
    }
    return arr;
}

char** solution(const char* myString) {
    int len = get_Split_X_Count(myString);
    int row = 0;
    int col = 0;
    char** answer = (char**)malloc((len) * sizeof(char*));
    
    for(int i = 0; i < len; i++){
        answer[i] = (char*)calloc(100001, sizeof(char));
    }
    
    for(int j = 0; myString[j] != '\0'; j++){
        if(myString[j] == 'x') {
            if(col > 0){
                answer[row][col] = '\0';
                col = 0;
                row++;
            }
        }else {
            answer[row][col++] = myString[j];
        }
    }
    
    if(col > 0){
        answer[row][col] = '\0';
        col = 0;
        row++;
    }
    
    answer = bubble_sort(answer, len);
    
    return answer;
}