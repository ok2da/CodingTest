import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int element = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(i != 0){
                index = list.size() - 1;
                element = list.get(index);
            }
            
            if(c >= 48 && c <= 57) {
                if(c == '0' && element == 1) {
                    list.set(index, 10);
                }else {
                    list.add(c - 48);
                }
            }else {
                switch(c){
                    case 'S':
                        break;
                    case 'D':
                        list.set(index, element * element);
                        break;
                    case 'T':
                        list.set(index, element * element * element);
                        break;
                    case '*':
                        list.set(index, element * 2);
                        if(index >= 1) list.set(index - 1, list.get(index - 1) * 2);
                        break;
                    case '#':
                        list.set(index, element * -1);
                        break;
                }
            }
        }
        
        for(int l : list){
            answer += l;
        }
        
        
        return answer;
    }
}