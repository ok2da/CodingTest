import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        //keymap 배열에 할당된 문자열과 인덱스를 HashMap에 삽입
        for(int i = 0; i < keymap.length; i++){
            String keyboard = keymap[i];
            
            for(int l = 0; l < keyboard.length(); l++){
                char str = keyboard.charAt(l);
                
                //HashMap에 해당 키가 없다면 넣고, 있다면 가장 적은 인덱스일 경우 교체
                if(!map.containsKey("" + str)){
                    map.put("" + str, l + 1);
                }else if(map.get("" + str) > l + 1){
                    map.put("" + str, l + 1);
                }
            }
        }
        
        //targets 배열에서 입력할 문자를 찾음
        for(int j = 0; j < targets.length; j++){
            String keys = targets[j];
            
            for(int k = 0; k < keys.length(); k++){
                char key = keys.charAt(k);
                
                //HashMap에 해당 문자가 있다면 인덱스를 더하고, 없다면 -1를 부여하고 브레이크
                if(map.containsKey("" + key)){
                    answer[j] += map.get("" + key);
                }else{
                    answer[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}