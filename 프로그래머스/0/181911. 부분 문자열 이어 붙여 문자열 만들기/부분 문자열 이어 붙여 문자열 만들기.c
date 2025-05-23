#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// my_strings_len은 배열 my_strings의 길이입니다.
// parts_rows는 2차원 배열 parts의 행 길이, parts_cols는 2차원 배열 parts의 열 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_strings[], size_t my_strings_len, int** parts, size_t parts_rows, size_t parts_cols) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int len = getSize(parts_rows, parts) + 1;
    
    char* answer = (char*)malloc(sizeof(char) * len);

    int s, e, idx = 0;
    
    for(int j = 0; j < parts_rows; j++){
        s = parts[j][0];
        e = parts[j][1];
        
        for(; s <= e; s++){
            answer[idx++] = my_strings[j][s];
        }
    }
    
    answer[idx] = '\0';
    
    return answer;
}

int getSize(int rows, int** parts){
    
    int len = 0;
    
    for(int i = 0; i < rows; i++){
        len += parts[i][1] - parts[i][0] + 1;
    }
    
    return len;
}