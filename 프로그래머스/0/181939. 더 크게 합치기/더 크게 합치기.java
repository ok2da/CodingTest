class Solution {
        public int solution(int a, int b) {
      	String mix1 = String.valueOf(a) + String.valueOf(b);
    	int gab1 = Integer.valueOf(mix1);
      	String mix2 = String.valueOf(b) + String.valueOf(a);
    	int gab2 = Integer.valueOf(mix2);   
    	 int answer;
    
    	if ( gab1 >= gab2 ){
            return answer = gab1;
        } else {
            return answer = gab2;
        }
    }
}