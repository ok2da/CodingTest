#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* ineq, const char* eq, int n, int m) {
    int answer = -1;
    char a = *ineq;
    char b = *eq;
    
    if(a == '>' && b == '=') {
        answer = n >= m ? 1 : 0;
    }else if(a == '>' && b == '!'){
        answer = n > m ? 1 : 0;
    }else if(a == '<' && b == '='){
        answer = n <= m ? 1 : 0;
    }else if(a == '<' && b == '!'){
        answer = n < m ? 1 : 0;
    }
    
    return answer;
}