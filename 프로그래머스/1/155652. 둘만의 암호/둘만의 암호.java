import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        //skip한 알파벳들을 담을 list, result를 출력할 StringBuilder
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        //list에 알파벳을 추가
        for(Character ch = 'a'; ch <= 'z'; ch++) {
            list.add(ch);
        }
        
        //list에 skip에 관련한 알파벳을 제거
        for(int i = 0; i < skip.length(); i++){
            list.remove(Character.valueOf(skip.charAt(i)));
        }
        
        //s 문자열을 하나씩 나눈 문자열이 ArrayList에 위치한 인덱스와 index를 더함
        for(int l = 0; l < s.length(); l++){
            char c = s.charAt(l);
            int list_index = list.indexOf(c) + index;
            
            //한바퀴 돌 상황을 가정해서 list의 크기와 나누어 나눈 위치가 최종 index
            if(list_index > list.size()) {
                list_index %= list.size();
            }else if(list_index == list.size()){
                list_index = 0;
            }
            
            sb.append(list.get(list_index));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}