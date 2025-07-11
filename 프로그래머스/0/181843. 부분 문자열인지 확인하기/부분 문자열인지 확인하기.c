#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* my_string, const char* target) {
    int answer = 0;
    int s_len = strlen(my_string);
    int t_len = strlen(target);
    int cnt = 0;
    
    for(int i = 0; i < s_len; i++){
        cnt = 0;
        for(int j = 0; j < t_len; j++){
            if(my_string[i + j] == target[j]){
                cnt++;
            }else {
                break;
            }
        }
        if(cnt == t_len) {
            answer++;
            break;
        }
    }
    
    return answer;
}