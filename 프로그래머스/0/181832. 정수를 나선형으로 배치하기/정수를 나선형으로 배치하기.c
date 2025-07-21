#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int** solution(int n) {
    int** answer = (int**)malloc(n * sizeof(int*));
    int cnt = 1;
    int dir = 0;
    int x = 0, y = 0;
    int nx = 0, ny = 0;
    int xx[4] = {1, 0, -1, 0};  // 우, 하, 좌, 상
    int yy[4] = {0, 1, 0, -1};
    
    for(int i = 0; i < n; i ++){
        answer[i] = calloc(n, sizeof(int));
    }
    
    while(cnt <= n * n){
        answer[y][x] = cnt++;
        
        // xx 또는 yy 배열로 다음 좌표계산
        nx = x + xx[dir];
        ny = y + yy[dir];
        
        // x 또는 y가 0보다 작아질때, n-1보다 클때, 이미 삽입한 값이 있을때 방향 변경
        if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[ny][nx] != 0){
            dir = (dir + 1) % 4;    // 처음 0 - 1 - 2 - 3 - 0 ...
            nx = x + xx[dir];
            ny = y + yy[dir];
        }
        
        x = nx;
        y = ny;
    }
    
    
    return answer;
}