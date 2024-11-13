import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int len = strings.length;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //인덱스 n의 문자가 같을때 사전순 비교
                if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }

                //인덱스 n문자가 다를경우 ASCII 값으로 정렬
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        
        // 얕은 복사
        answer = strings;
        
        return answer;
    }
}