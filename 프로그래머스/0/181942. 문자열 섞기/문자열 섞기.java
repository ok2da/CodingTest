class Solution {
    public String solution(String str1, String str2) {
    	String answer = "";
    	for(int cnt = 0; cnt < str1.length(); cnt++) {
    		answer += str1.charAt(cnt);
    		answer += str2.charAt(cnt);
    	}
    	
        return answer;
        }
    }