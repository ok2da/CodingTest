import java.util.*;
class Solution {
    
    static class Plan {
        String name;
        int starttime;
        int playtime;

        public Plan(String name, int starttime, int playtime){
            this.name = name;
            this.starttime = starttime;
            this.playtime = playtime;
        }
    }
    
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        Stack<Plan> stack = new Stack<>();

        Arrays.sort(plans, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });

        int index = 0;

        for(int i = 0; i < plans.length; i++){

            String name = plans[i][0];
            int start_time = (Integer.parseInt(plans[i][1].substring(0,2)) * 60) + (Integer.parseInt(plans[i][1].substring(3)));
            int play_time = Integer.parseInt(plans[i][2]);

            // 첫 요소일때
            if(i == 0){
                stack.push(new Plan(name, start_time, play_time));
                continue;
            }

            if(!stack.isEmpty()){
                Plan plan = stack.pop();
                String name_p = plan.name;
                int start_time_p = plan.starttime;
                int play_time_p = plan.playtime;
                boolean check = false;

                // 다음 과목 시작 시간과의 여유 시간
                int difference = start_time - start_time_p;

                // 여유 시간이 존재하는지 확인
                if(difference <= 0){
                    stack.push(plan);
                }else {
                    // 여유 시간으로 남은 시간을 다 채울 수 있는지 확인
                    if(difference >= play_time_p){
                        difference -= play_time_p;
                        answer[index] = name_p;
                        index++;

                        //중복 체크
                        check = true;

                        // 여유 시간이 없다면 다음 과제로
                        if(difference <= 0) {
                            stack.push(new Plan(name, start_time, play_time));
                            continue;
                        }
                    }else {
                        start_time_p += difference; // 사실 필요없음
                        play_time_p -= difference;
                        difference = 0;
                    }

                    //여유 시간 남은게 있고, 스택에 미뤄진 요소가 있을때
                    while(difference > 0 && !stack.isEmpty()){
                        Plan plan2 = stack.pop();
                        String name_p2 = plan2.name;
                        int start_time_p2 = plan2.starttime;
                        int play_time_p2 = plan2.playtime;

                        int difference_p2 = difference;

                        if(difference >= play_time_p2){
                            difference -= play_time_p2;
                            answer[index] = name_p2;
                            index++;
                        }else {
                            start_time_p2 += difference; // 사실 필요없음
                            difference -= play_time_p2;
                            play_time_p2 -= difference_p2;

                            stack.push(new Plan(name_p2, start_time_p2, play_time_p2));
                        }
                    }

                    if(!check){
                        stack.push(new Plan(name_p, start_time_p, play_time_p));
                    }
                    // 스택에 미뤄진 요소 체크가 끝나면, 다음 과제 스택에 추가
                    stack.push(new Plan(name, start_time, play_time));

                }

            }else {
                answer[index] = name;
                index++;
            }

        }

        while(!stack.isEmpty()){
            answer[index] = stack.pop().name;
            index++;
        }
        
        return answer;
    }
}