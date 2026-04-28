#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

char* solution(int a, int b) {
    char* answer = (char*)malloc(4 * sizeof(char));
    char* day[7]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
    struct tm date = {};
    
    date.tm_year = 2016 - 1900; //1900년 기준이므로 구하려는 년도 - 1900
    date.tm_mon = a - 1;        //0 ~ 11 => 1 ~ 12월 이므로 월 - 1
    date.tm_mday = b;
    mktime(&date);
    
    strcpy(answer, day[date.tm_wday]);
    
    return answer;
}