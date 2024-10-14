class Solution {
    public String solution(String[] survey, int[] choices) {
        
        // 1 = R , T || 2 = C , F || 3 = J , M || 4 = A , N
        // 선택지 = 비동의 <- 1 2 3 || 4 || 5 6 7 -> 동의
        
        String answer = "";
        int[] result = new int[8];
        String[] str = {"R","T","C","F","J","M","A","N"};

        for(int i = 0; i < survey.length; i++){
            String category = survey[i];
            int select = choices[i];

            if(category.equals("RT")){
                result[0] += select < 4 ? 4 - select : 0;
                result[1] += select > 4 ? select - 4 : 0;
            }else if(category.equals("TR")){
                result[1] += select < 4 ? 4 - select : 0;
                result[0] += select > 4 ? select - 4 : 0;
            }else if(category.equals("CF")){
                result[2] += select < 4 ? 4 - select : 0;
                result[3] += select > 4 ? select - 4 : 0;
            }else if(category.equals("FC")){
                result[3] += select < 4 ? 4 - select : 0;
                result[2] += select > 4 ? select - 4 : 0;
            }else if(category.equals("JM")){
                result[4] += select < 4 ? 4 - select : 0;
                result[5] += select > 4 ? select - 4 : 0;
            }else if(category.equals("MJ")){
                result[5] += select < 4 ? 4 - select : 0;
                result[4] += select > 4 ? select - 4 : 0;
            }else if(category.equals("AN")){
                result[6] += select < 4 ? 4 - select : 0;
                result[7] += select > 4 ? select - 4 : 0;
            }else if(category.equals("NA")){
                result[7] += select < 4 ? 4 - select : 0;
                result[6] += select > 4 ? select - 4 : 0;
            }
        }

        for(int j = 0; j < 8; j += 2){
            if(result[j] >= result[j + 1]){
                answer += str[j];
            }else if(result[j + 1] > result[j]){
                answer += str[j + 1];
            }
        }
        
        
        return answer;
    }
    
}