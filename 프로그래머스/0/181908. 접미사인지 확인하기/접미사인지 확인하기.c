#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* is_suffix) {
    int answer = 0;
    int string_len = strlen(my_string);
    int suffix_len = strlen(is_suffix);
    
    // 접미사가 문자열보다 길때 false
    if(suffix_len > string_len) return 0;
    // 비교을 위한 인덱스를 구하여 포인터 설정
    const char* check = my_string + (string_len - suffix_len);

    if(strcmp(check, is_suffix) == 0) return 1;
    
    return answer;
}