#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    int x, y;
} Point;

Point find_start(size_t w, size_t h, const char* park[]) { // 'S'의 스타트 좌표(x, y)를 찾기
    Point p = {-1, -1};
    for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
            if(park[i][j] == 'S'){
                p.x = j;
                p.y = i;
                return p;
            }
        }
    }
    return p;
}

Point move(Point p, size_t w, size_t h, const char* park[], const char* routes) { // "E 2"의 방향, 칸수를 가되 장애물이 없다면 이동
    char direction;
    int number;

    int direction_x[] = {1, -1, 0, 0};  // 동E 서W 남S 북N
    int direction_y[] = {0, 0, 1, -1};  // 동E 서W 남S 북N
    int direction_idx = -1;
    int nx = p.x;
    int ny = p.y;
    
    sscanf(routes, "%c %d", &direction, &number);
    
    switch(direction){  // 방향에 맞는 idx 부여
        case 'E':
            direction_idx = 0;
            break;
        case 'W':
            direction_idx = 1;
            break;
        case 'S':
            direction_idx = 2;
            break;
        case 'N':
            direction_idx = 3;
            break;
        default:
            return p;
    }
    
    for(int i = 0; i < number; i++){    // 칸수만큼 이동을 하되, 크기가 맞지 않거나 장애물 확인
        nx += direction_x[direction_idx];
        ny += direction_y[direction_idx];
        
        if(nx < 0 || nx >= w || ny < 0 || ny >= h || park[ny][nx] == 'X') {
            return p;
        }
    }
    
    p.x = nx;
    p.y = ny;
    
    return p;
}

int* solution(const char* park[], size_t park_len, const char* routes[], size_t routes_len) {
    int* answer = (int*)malloc(2 * sizeof(int));
    size_t W = strlen(park[0]);
    size_t H = park_len;
    
    Point P = find_start(W, H, park);   // 스타트 좌표 찾기
    
    for(int i = 0; i < routes_len; i++){    // 이동 좌표 수정하기
        P = move(P, W, H, park, routes[i]);
    }
    
    answer[0] = P.y;
    answer[1] = P.x;
    
    return answer;
}