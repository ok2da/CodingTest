#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* myString, const char* pat) {
    int answer = 0;
    int cnt = 0;
    int str_len = strlen(myString);
    int pat_len = strlen(pat);
    
    for(int i = 0; i <= str_len - pat_len; i++){
        cnt = 0;
        for(int j = 0; j < pat_len; j++){
            if(myString[i + j] == pat[j]) {
                cnt++;
            }else {
                break;
            }
        }
        if(cnt == pat_len) answer++;
    }
    
    
    return answer;
}