#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = true;
    int n = x;
    int sum = 0;
    
    while(n != 0){
        sum += n % 10;
        n /= 10;
    }
    
    answer = x % sum ? false : true;
    
    return answer;
}
