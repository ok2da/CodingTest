class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
		StringBuilder sb = new StringBuilder(my_string);
		
		for(int i = 0; i< queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			
			while(start < end) {
				char c1 = sb.charAt(start);
				char c2 = sb.charAt(end);
				sb.setCharAt(start, c2);
				sb.setCharAt(end, c1);
                
				start++; end--;
			}
		}
        
        answer = sb.toString();
        
        return answer;
    }
}