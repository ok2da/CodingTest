class Solution {
    
    //최종 구독수, 최종 금액, 이모티콘 개수
    static int result_subscribe;
    static int result_amount;
    static int len;
    
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer;

        len = emoticons.length;

        back(0, new int[len], users, emoticons);

        answer = new int[]{result_subscribe, result_amount};

        return answer;
    }
    
    public static void back(int depth, int[] discountItem, int[][] users, int[] emoticons) {
        if(depth == len){
            calculate(discountItem, users, emoticons);
        }else {
            for(int i = 10; i <= 40; i+= 10){
                discountItem[depth] = i;
                back(depth + 1, discountItem, users, emoticons);
            }
        }
    }
    
    public static void calculate(int[] discountItem, int[][] users, int[] emoticons) {
        int subscribe = 0;
        int amount = 0;

        for(int[] user : users){
            int discount = user[0];
            int price = user[1];
            int sum = 0;

            for(int i = 0; i < len; i++){
                if(discountItem[i] >= discount){
                    sum += emoticons[i] / 100 * (100 - discountItem[i]);
                }
            }

            if(sum >= price){
                subscribe++;
            }else {
                amount += sum;
            }
        }

        if(subscribe > result_subscribe){
            result_subscribe = subscribe;
            result_amount = amount;
        }else if(subscribe == result_subscribe){
            result_amount = amount > result_amount ? amount : result_amount;
        }
        
    }
    
    
}