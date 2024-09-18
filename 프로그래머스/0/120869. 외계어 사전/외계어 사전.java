class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i = 0; i < dic.length; i++){
            int len = 0;
            
            for(int j = 0; j < spell.length; j++){
                if(dic[i].indexOf(spell[j]) != -1) len++;
            }
            
            if(len == spell.length) return answer = 1;
        }
        
        return answer;
    }
}