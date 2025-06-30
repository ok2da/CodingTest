#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

int solution(const char* binomial) {
    int answer = 0;
    int a = 0;
    int b = 0;
    char op = ' ';
    size_t len = strlen(binomial);
    
    for(int i = 0; i < len; i++){
        char n = binomial[i];
        if(n == ' '){
            op = binomial[i + 1];
            i += 2;
            continue;
        }
        
        if(op == ' '){
            a = a * 10 + (n - '0');
        }else {
            b = b * 10 + (n - '0');
        }
    }
    
    switch(op){
        case '+':
            answer = a + b;
            break;
        case '-':
            answer = a - b;
            break;
        case '*':
            answer = a * b;
            break;
    }
 
    return answer;
}