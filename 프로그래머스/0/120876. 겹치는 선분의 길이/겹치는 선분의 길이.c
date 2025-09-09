#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// lines_rows는 2차원 배열 lines의 행 길이, lines_cols는 2차원 배열 lines의 열 길이입니다.
int solution(int** lines, size_t lines_rows, size_t lines_cols) {
    int answer = 0;
    int line[201] = {0,};
    int min = 101;
    int max = 0;

    for(int i = 0; i < lines_rows; i++){
        int start = lines[i][0];
        int end = lines[i][1];

        if(min > start) min = start;
        if(max < end) max = end;
        
        for(; start < end; start++){
            line[start + 100]++;
        }
    }
    
    for(; min <= max; min++){
        if(line[min + 100] > 1){
            answer++;
        }
    }

    
    return answer;
}