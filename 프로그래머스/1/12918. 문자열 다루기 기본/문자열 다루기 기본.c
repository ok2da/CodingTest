#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(const char* s) {
    
    if(strlen(s) != 4 && strlen(s) != 6){
        return false;
    }
    
    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] >= 'a' && s[i] <= 'z'){
            return false;
        }else if(s[i] >= 'A' && s[i] <= 'Z'){
            return false;
        }
    }
    
    
    return true;
}