class Solution {
    public int[] solution(String[] park, String[] routes) {
        //result 배열, 시작(x,y) 좌표, 최대(x,y) 좌표
        int[] answer = new int[2];
        int start_x = -1;
        int start_y = -1;
        int max_x = park[0].length() - 1;
        int max_y = park.length - 1;
        
        //park 배열에서 시작점 좌표 찾기
        for(int i = 0; i < park.length; i++){
            for(int k = 0; k < park[i].length(); k++){
                char c = park[i].charAt(k);
                if(c == 'S') {
                    start_x = k;
                    start_y = i;
                    break;
                }
            }
            if(start_x != -1 && start_y != -1) break;
        }
        
        //이동 방향으로 좌표 이동하기
        for(int i = 0; i < routes.length; i++){

            //이동 방향, 이동 수, 크기/장애물 감지
            String direction = String.valueOf(routes[i].charAt(0));
            int movement = routes[i].charAt(2) - '0';
            boolean check = false;

            for(int j = 1; j <= movement; j++){
                //크기를 벗어나서 이동할 수 없을때, 이동시 장애물 발견시 boolean 함수 변경
                switch(direction){
                    case "W":
                        if(start_x - movement <= -1) {
                            check = true;
                            break;
                        }
                        if(park[start_y].charAt(start_x - j) == 'X') check = true;
                        break;
                    case "E":
                        if(start_x + movement > max_x) {
                            check = true;
                            break;
                        }
                        if(park[start_y].charAt(start_x + j) == 'X') check = true;
                        break;
                    case "N":
                        if(start_y - movement <= -1) {
                            check = true;
                            break;
                        }
                        if(park[start_y - j].charAt(start_x) == 'X') check = true;
                        break;
                    case "S":
                        if(start_y + movement > max_y) {
                            check = true;
                            break;
                        }
                        if(park[start_y + j].charAt(start_x) == 'X') check = true;
                        break;
                }
            }

            //제한조건에 걸리지 않을 경우 좌표 이동
            if(!check) {
                switch(direction){
                    case "W":
                        start_x -= movement;
                        break;
                    case "E":
                        start_x += movement;
                        break;
                    case "N":
                        start_y -= movement;
                        break;
                    case "S":
                        start_y += movement;
                        break;
                }
            }
        }

        answer[0] = start_y;
        answer[1] = start_x;

        
        return answer;
    }
}