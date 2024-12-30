class Solution {
	    public int solution(int n, String control) {
	        int answer = 0;
	        
	        char[] c = control.toCharArray();
	        
	        for(char cc : c){
                if(cc == 'w'){
                    n += 1;
                }else if(cc == 's'){
                    n -= 1;
                }else if(cc == 'd'){
                    n += 10;
                }else if(cc == 'a'){
                    n -= 10;
                }             
	        }
	        answer = n;
            
	        return answer;
	    }
}