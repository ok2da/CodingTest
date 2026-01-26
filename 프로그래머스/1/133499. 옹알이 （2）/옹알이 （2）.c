#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// babbling_len은 배열 babbling의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* babbling[], size_t babbling_len) {
    int answer = 0;
    int len = 0;
    int check = -1;
    
    const char* aya = "aya";
    const char* ye = "ye";
    const char* woo = "woo";
    const char* ma = "ma";
    
    for(int i = 0; i < babbling_len; i++){
        check = -1;
        len = strlen(babbling[i]);
        
        while(*babbling[i]){
            if(strncmp(babbling[i], aya, 3) == 0){
                if(check == 1) break;
                check = 1;
                babbling[i] += 3;
            }else if(strncmp(babbling[i], ye, 2) == 0){
                if(check == 2) break;
                check = 2;
                babbling[i] += 2;
            }else if(strncmp(babbling[i], woo, 3) == 0){
                if(check == 3) break;
                check = 3;
                babbling[i] += 3;
            }else if(strncmp(babbling[i], ma, 2) == 0){
                if(check == 4) break;
                check = 4;
                babbling[i] += 2;
            }else{
                break;
            }
        }
        
        if(*babbling[i] == '\0') answer++;
    }
    
    return answer;
}