#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* A, const char* B) {
    int answer = 0;
    int len = strlen(B);
    int idx = 0;
    int point = 0;
    
    for(int i = 0; i < len * 2; i++){
        char Bc = i >= len ? B[i - len]: B[i];
        
        if(A[idx] == Bc){
            if(idx == 0) point = i;
            idx++;
        }else {
            if(idx > 0) i = point;  // 시작점 오류일 경우 해당 지점 재탐색
            idx = 0;
        }
        
        if(idx == len) break;
    }
    
    answer = idx == len ? point : -1;
    
    printf("%d %d", idx, point);
    
    return answer;
}