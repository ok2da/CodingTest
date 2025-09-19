#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* polynomial) {
    char* answer = (char*)malloc(1);
    char* temp = (char*)malloc(100);
    int x = 0, n = 0, t = 0;
    size_t len = 0;
    
    while(*polynomial){
        if(*polynomial >= '0' && *polynomial <= '9'){
            if(t != 0){
                t *= 10;
            }
            t += *polynomial - '0';
        }
        if(*polynomial == 'x'){
            if(t == 0){
                x += 1;
            }else {
                x += t;
            }
            t = 0;
        }
        if(*polynomial == ' '){
            if(t != 0){
                n += t;
                t = 0;
            }
            polynomial += 2;
        }
           
        polynomial++;
    }
    
    if(t != 0) {
        n += t;
    }
    
    if(x != 0){
        if(n != 0){
            if(x == 1){
                sprintf(temp, "x + %d", n);
            }else {
                sprintf(temp, "%dx + %d", x, n);
            }
        }else {
            if(x == 1){
                sprintf(temp, "x");
            }else {
                sprintf(temp, "%dx", x);
            }
        }
    }else if(n != 0){
        sprintf(temp, "%d", n);
    }
    
    len = strlen(temp);
    answer = realloc(temp, len + 1);
    
    return answer;
}