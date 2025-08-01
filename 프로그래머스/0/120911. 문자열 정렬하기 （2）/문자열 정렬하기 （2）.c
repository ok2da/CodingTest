#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
    return (*(char*)a) - (*(char*)b);
}

char* solution(const char* my_string) {
    size_t len = strlen(my_string);
    char* answer = (char*)malloc((len + 1) * sizeof(char));
    
    for(int i = 0; i < len; i++){
        if(my_string[i] >= 97){
            answer[i] = my_string[i];
        }else {
            answer[i] = my_string[i] + 32;
        }
    }
    
    qsort(answer, len, sizeof(char), compare);
    
    // for(int j = 0; j < len - 1; j++){
    //     for(int l = 0 + j; l < len; l++){
    //         if(answer[j] > answer[l]){
    //             char temp = answer[j];
    //             answer[j] = answer[l];
    //             answer[l] = temp;
    //         }
    //     }
    // }
    
    answer[len] = '\0';
    
    return answer;
}