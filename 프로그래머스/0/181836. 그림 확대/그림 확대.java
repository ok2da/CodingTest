class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        String input_str = "";
        
        for(int i = 0; i < picture.length; i++){
            String str = picture[i];
            String temp_str = "";
            
            for(int l = 0; l < str.length(); l++){
                char temp_c = str.charAt(l);
                for(int j = 0; j < k; j++) temp_str += temp_c;
            }
            for(int m = 0; m < k; m++) input_str += temp_str + ",";
        }
        
        answer = input_str.split(",");

        return answer;
    }
}