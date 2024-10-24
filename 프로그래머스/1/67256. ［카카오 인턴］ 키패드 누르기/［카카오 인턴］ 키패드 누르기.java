import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();

        int left_x = 1;
        int left_y = 4;
        int right_x = 3;
        int right_y = 4;
        int left_dist = 0;
        int right_dist = 0;
        
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];

            switch(number){
                // left
                case 1:
                    left_x = 1;
                    left_y = 1;
                    sb.append("L");
                    break;
                case 4:
                    left_x = 1;
                    left_y = 2;
                    sb.append("L");
                    break;
                case 7:
                    left_x = 1;
                    left_y = 3;
                    sb.append("L");
                    break;
                // right
                case 3:
                    right_x = 3;
                    right_y = 1;
                    sb.append("R");
                    break;
                case 6:
                    right_x = 3;
                    right_y = 2;
                    sb.append("R");
                    break;
                case 9:
                    right_x = 3;
                    right_y = 3;
                    sb.append("R");
                    break;
                // middle
                case 2:
                    left_dist = Math.abs(2 - left_x) + Math.abs(1 - left_y);
                    right_dist = Math.abs(2 - right_x) + Math.abs(1 - right_y);

                    if(left_dist > right_dist){
                        right_x = 2;
                        right_y = 1;
                        sb.append("R");
                    }else if(left_dist < right_dist){
                        left_x = 2;
                        left_y = 1;
                        sb.append("L");
                    }else {
                        if(hand.equals("right")){
                            right_x = 2;
                            right_y = 1;
                            sb.append("R");
                        }else {
                            left_x = 2;
                            left_y = 1;
                            sb.append("L");
                        }
                    }

                    break;
                case 5:
                    left_dist = Math.abs(2 - left_x) + Math.abs(2 - left_y);
                    right_dist = Math.abs(2 - right_x) + Math.abs(2 - right_y);

                    if(left_dist > right_dist){
                        right_x = 2;
                        right_y = 2;
                        sb.append("R");
                    }else if(left_dist < right_dist){
                        left_x = 2;
                        left_y = 2;
                        sb.append("L");
                    }else {
                        if(hand.equals("right")){
                            right_x = 2;
                            right_y = 2;
                            sb.append("R");
                        }else {
                            left_x = 2;
                            left_y = 2;
                            sb.append("L");
                        }
                    }
                    break;
                case 8:
                    left_dist = Math.abs(2 - left_x) + Math.abs(3 - left_y);
                    right_dist = Math.abs(2 - right_x) + Math.abs(3 - right_y);

                    if(left_dist > right_dist){
                        right_x = 2;
                        right_y = 3;
                        sb.append("R");
                    }else if(left_dist < right_dist){
                        left_x = 2;
                        left_y = 3;
                        sb.append("L");
                    }else {
                        if(hand.equals("right")){
                            right_x = 2;
                            right_y = 3;
                            sb.append("R");
                        }else {
                            left_x = 2;
                            left_y = 3;
                            sb.append("L");
                        }
                    }
                    break;
                case 0:
                    left_dist = Math.abs(2 - left_x) + Math.abs(4 - left_y);
                    right_dist = Math.abs(2 - right_x) + Math.abs(4 - right_y);

                    if(left_dist > right_dist){
                        right_x = 2;
                        right_y = 4;
                        sb.append("R");
                    }else if(left_dist < right_dist){
                        left_x = 2;
                        left_y = 4;
                        sb.append("L");
                    }else {
                        if(hand.equals("right")){
                            right_x = 2;
                            right_y = 4;
                            sb.append("R");
                        }else {
                            left_x = 2;
                            left_y = 4;
                            sb.append("L");
                        }
                    }
                    break;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}