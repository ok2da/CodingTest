class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            String select = babbling[i];
            
            select = select.replaceAll("aya","!");
            select = select.replaceAll("ye","!");
            select = select.replaceAll("woo","!");
            select = select.replaceAll("ma","!");
            select = select.replaceAll("!","");

            answer += select.isEmpty() ? 1 : 0;
            
        }
        
        return answer;
    }
    
}