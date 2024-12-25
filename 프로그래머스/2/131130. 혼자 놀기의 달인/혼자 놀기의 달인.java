import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int size = cards.length;

        int[] check = new int[size];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++){
            int index = i;
            if(check[i] == 0){
                int count = 0;
                while(check[index] == 0){
                    check[index]++;
                    count++;
                    index = cards[index] - 1;
                }
                list.add(count);
            }
        }

        if(list.size() > 1){
            Collections.sort(list);
            answer = list.get(list.size() - 1) * list.get(list.size() - 2);
        }

        return answer;
    }
}