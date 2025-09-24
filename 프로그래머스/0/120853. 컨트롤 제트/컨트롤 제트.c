#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* s) {
    int answer = 0;
    int before = 0;
    int temp = 0;
    bool flag = false;
    bool before_flag = false;
    size_t len = strlen(s);
    
    for(int i = 0; i <= len; i++){
        if(s[i] == 'Z'){
            if(before_flag){
                answer += before;
            }else {
                answer -= before;
            }
            before = 0;
            before_flag = false;
            temp = 0;
            continue;
        }
        if(s[i] == ' ' || s[i] == '\0'){
            if(flag){
                answer -= temp;
            }else {
                answer += temp;
            }
            before_flag = flag;
            before = temp;
            temp = 0;
            flag = false;
            continue;
        }
        if(s[i] == '-'){
            flag = true;
            continue;
        }
        
        temp = temp * 10 + (s[i] - '0');
    }
    
    
    
    return answer;
}