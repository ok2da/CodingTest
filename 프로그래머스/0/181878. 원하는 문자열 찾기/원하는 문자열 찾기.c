#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* myString, const char* pat) {
    int answer = 0;
    int m_len = strlen(myString);
    int p_len = strlen(pat);
    
    if(m_len < p_len) return 0;
    
    for(int i = 0; i <= m_len - p_len; i++){
        for(int j = 0; j < p_len; j++){
            char c = tolower(myString[i + j]);
            char c2 = tolower(pat[j]);
            
            if(c != c2){
                break;
            }else{
                if(j == p_len - 1) return ++answer;
            }
        }
    }
    
    return answer;
}