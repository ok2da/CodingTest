#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

int solution(int n) {
    int answer = 0;

    while(n != 0){
        answer *= 3;
        answer += n % 3;
        n /= 3;
    }
    // 1] n = 45        2] n = 15       3] n = 5        4] n = 1
    // 1) -> 0 *= 3     2) -> 0 *= 3    3) -> 0 *= 3    4) -> 2 *= 3
    // 1) -> 0 += 0     2) -> 0 += 0    3) -> 0 += 2    4) -> 6 += 1
    // 1) answer = 0    2) answer = 0   3) answer = 2   4) answer = 7
    
    return answer;
}