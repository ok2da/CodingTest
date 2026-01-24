#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* s) {
    int answer = 0;
    int len = strlen(s);
    int idx = 0;
    char x;
    int x_cnt, n_cnt;   //x의 수, x가 아닌 수
    
    while(idx < len){
        x = s[idx++];                   // 처음 s[i]를 x에 할당후 다음 문자열 확인을 위해 후위증가
        x_cnt = 1, n_cnt = 0;
        while(idx < len){               // idx가 크기를 벗어날 때까지, x의 수가 n의 수와 같을때 까지
            if(x_cnt == n_cnt) break;
            
            if(s[idx++] == x){          // x와 비교 후 idx 후위증가
                x_cnt++;
            }else {
                n_cnt++;
            }
        }
        answer++;
    }
    
    return answer;
}