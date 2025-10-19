#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

const char* morse[] = {
    ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
    "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
    "..-","...-",".--","-..-","-.--","--.."
    };

char* solution(const char* letter) {
    char* answer = (char*)malloc(26 * sizeof(char));
    char* code = (char*)malloc(5 * sizeof(char));
    size_t len = strlen(letter);
    int cnt = 0;
    int idx = 0;
    
    for(int i = 0; i < len;){
        if(letter[i] == ' '){                   //공백 감지하면 다음으로 이동
            i++;
            continue;
        }
        
        for(int j = 0; j < 4; j++){             //다음 공백까지 모스부호 저장
            if(letter[i + j] == ' '){
                break;
            }
            cnt++;
            code[j] = letter[i + j];
        }

        code[cnt] = '\0';

        for(int k = 0; k < 26; k++){            //morse에 저장된 모스부호와 동일한지 탐색
            if(strcmp(morse[k], code) == 0){
                answer[idx++] = k + 'a';
            }
        }
        
        i += cnt;                               //for문 i값 조작과 임시 변수 초기화
        cnt = 0;
        memset(code, 0, 5);
    }
    
    answer[idx] = '\0';
    
    return answer;
}