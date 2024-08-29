import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
		int answer = 0;

        for(int i = 0; i < myString.length(); i++) {
        	int count = 0;

        	if(i + pat.length() > myString.length()) break;
        	
        	for(int j = 0; j < pat.length(); j++) {
        		if(myString.charAt(i+j) == pat.charAt(j)) {
        			count++;
        		}else {
        			count = 0;
        			break;
        		}
        	}
        	
        	if(count == pat.length()) answer++;
        }
        
        return answer;
    }
}