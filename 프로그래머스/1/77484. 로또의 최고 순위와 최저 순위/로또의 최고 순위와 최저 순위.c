#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int lottos[], size_t lottos_len, int win_nums[], size_t win_nums_len) {
    int* answer = (int*)malloc(2 * sizeof(int));    // 최고 순위, 최저 순위
    answer[0] = 7;
    answer[1] = 7;
    int lotto_numbers[46] = {0};
    
    for(int i = 0; i < win_nums_len; i++){
        lotto_numbers[win_nums[i]]++;
    }
    for(int j = 0; j < lottos_len; j++){
        if(lottos[j] > 45) continue;
        if(lottos[j] == 0){
            answer[0]--;
        }else if(lotto_numbers[lottos[j]] > 0){
            answer[0]--;
            answer[1]--;
        }
    }
    
    answer[0] = answer[0] == 7 ? 6 : answer[0];
    answer[1] = answer[1] == 7 ? 6 : answer[1];

    return answer;
}