#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>



char* solution(const char* a, const char* b) {
    int a_len = strlen(a);
    int b_len = strlen(b);
    int len = a_len > b_len ? a_len : b_len;
    char* answer = (char*)malloc((len + 2) * sizeof(char));
    answer[len + 1] = '\0';
    int i = a_len - 1, j = b_len - 1, c = 0, k = len;
    
    while(k > 0){
        int ad = i >= 0 ? a[i--] - '0' : 0;
        int bd = j >= 0 ? b[j--] - '0' : 0;
        int sum = ad + bd + c;
        answer[k--] = sum % 10 + '0';
        c = sum / 10;
    }
    
    if(c > 0){
        answer[0] = '1';
        return answer;
    }else {
        // answer = answer + 1; -> 메모리 누수, 
        // 자바와 다르게 함수 종료시에도 메모리가 남아있음. c에는 가비지 컬렉션이 없음 직접 해체
        char* result = strdup(answer + 1);
        free(answer);
        return result;
    }
}