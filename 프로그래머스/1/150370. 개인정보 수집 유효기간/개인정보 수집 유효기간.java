import java.util.*;
import java.time.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // today를 기준으로, 수집일 privacies 에서 약관 terms를 비교하여 삭제될 정보 인덱스를 배열로 리턴
        int[] answer = {};
        
        Map<String, Integer> standard = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        today = today.replace(".","-");
        LocalDate todays = LocalDate.parse(today);

        //약관을 Map에 삽입
        for(int i = 0; i < terms.length; i++){
            String type = terms[i].substring(0, 1);
            int month = Integer.parseInt(terms[i].substring(2));
            
            standard.put(type, month);
        }
        
        //수집일자에 약관 종류의 기간을 더하여 오늘 날짜와 비교하여 이전이면 list에 추가
        for(int j = 0; j < privacies.length; j++){
            String exp = privacies[j].substring(0, 10).replace(".", "-");
            String condition = privacies[j].substring(11);
            LocalDate temp = LocalDate.parse(exp).plusMonths(standard.get(condition)).minusDays(1);
            
            if(temp.isBefore(todays)) result.add(j + 1);
        }
        
        answer = new int[result.size()];
        
        for(int k = 0; k < result.size(); k++){
            answer[k] = result.get(k);
        }
        
        return answer;
    }
}