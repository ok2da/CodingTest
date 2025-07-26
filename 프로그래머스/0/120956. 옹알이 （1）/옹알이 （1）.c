#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* babbling[], size_t babbling_len) {
    int answer = 0;
    int matchCnt = 0;
    const char* babyTalk[4] = {"aya", "ye", "woo", "ma"};
    int wordLen[4] = {3, 2, 3, 2};
    
    for(int i = 0; i < babbling_len; i++){
        const char* temp = babbling[i];
        bool valid = true;

        while(*temp){
            bool check = false;
            
            for(int j = 0; j < 4; j++){
                if(strncmp(temp, babyTalk[j], wordLen[j]) == 0){
                    temp += wordLen[j];
                    check = true;
                    break;
                }
            }
            
            if(!check) {
                valid = false;
                break;
            }
        }
        
        if(valid){
            answer++;
        }
        
    }
    
    return answer;
}