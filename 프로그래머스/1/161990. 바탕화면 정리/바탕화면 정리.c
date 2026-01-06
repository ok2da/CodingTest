#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(const char* wallpaper[], size_t wallpaper_len) {
    int* answer = (int*)calloc(4, sizeof(int));
    
    int min_x = strlen(wallpaper[0]), min_y = wallpaper_len, max_x = -1, max_y = -1;
    
    for(int i = 0; i < wallpaper_len; i++){
        for(int j = 0; wallpaper[i][j] != '\0'; j++){
            if(wallpaper[i][j] == '#'){
                if(min_x > j) min_x = j;
                if(min_y > i) min_y = i;
                if(max_x < j) max_x = j;
                if(max_y < i) max_y = i;
            }
        }
    }
    
    answer[0] = min_y;
    answer[1] = min_x;
    answer[2] = max_y + 1;
    answer[3] = max_x + 1;
    
    return answer;
}