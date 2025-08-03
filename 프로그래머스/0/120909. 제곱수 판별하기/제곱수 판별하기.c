#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int r = sqrt(n);
    int answer = r * r == n ? 1 : 2;
    return answer;
}