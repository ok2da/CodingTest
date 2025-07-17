#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    const char* coffee;
    int price;
} Menu;

const Menu menu[] = {
    {"iceamericano", 4500},
    {"americanoice", 4500},
    {"hotamericano", 4500},
    {"americanohot", 4500},
    {"americano", 4500},
    {"anything", 4500},
    {"icecafelatte", 5000},
    {"cafelatteice", 5000},
    {"hotcafelatte", 5000},
    {"cafelattehot", 5000},
    {"cafelatte", 5000}
};

int solution(const char* order[], size_t order_len) {
    int answer = 0;
    
    for(int i = 0; i < order_len; i++){
        for(int j = 0; j <= 11; j++){
            if(strcmp(menu[j].coffee, order[i]) == 0){
                answer += menu[j].price;
                break;
            }
        }
    }
    
    return answer;
}