import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String,Integer> rank = new HashMap<>();
        
        // HashMap에 players배열 선수이름(키), 순위(값) 삽입
        for(int i = 0; i < players.length; i++){
            rank.put(players[i],i);
        }
        
        // callings배열을 순회
        for(int l = 0; l < callings.length; l++){
            //이름 불린 선수의 이름, 순위 기억
            String runner = callings[l];
            int index = rank.get(callings[l]);
            
            //이름 불린 선수의 앞 선수의 이름 기억하고, 순위 변경
            String taget = players[index - 1];
            players[index - 1] = runner;
            players[index] = taget;

            //HashMap에서 선수의 순위를 조정
            rank.put(runner, index - 1);
            rank.put(taget, index);
        }
        
        //변경한 players 배열 주소값을 참조해 answer로 지정
        answer = players;

        return answer;
    }
}