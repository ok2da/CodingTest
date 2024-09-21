import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        //중복 X
        Set<Integer> set = new LinkedHashSet<>();

        //2로 나눌 수 있으면 추가
        while(n % 2 == 0){
            set.add(2);
            n /= 2;
        }
        
        //3부터 시작해서 홀수로 나눌 수 있으면 추가
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }
        
        //마지막 n이 소수인 경우 추가
        if(n > 2) set.add(n);
        
        //추가한 크기만큼 배열 생성
        answer = new int[set.size()];
        
        //요소 순회를 위해 set의 반복자인 Iterator 객체를 생성
        Iterator<Integer> iterator = set.iterator();
        
        //요소를 answer 배열에 추가
        for(int j = 0; j < answer.length; j++){
            answer[j] = iterator.next();
        }
        
        return answer;
    }
}