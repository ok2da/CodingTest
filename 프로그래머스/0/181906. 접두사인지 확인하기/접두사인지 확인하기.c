#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* is_prefix) {
    int answer = 0;
    int idx = 0;
    int len = strlen(is_prefix);
    
    while(1){
        if(idx == len){
            return 1;
        }else if(my_string[idx] == is_prefix[idx]){
            idx++;
        }else {
            break;
        }
    }
    
    return answer;
}