class Solution {
    public String solution(int[] numLog) {
        String answer = "";
		        int a = 0;
		        StringBuilder sb = new StringBuilder();
		        for(int i = 1; i<numLog.length; i++){
		            a = numLog[i] - numLog[i-1];
		            if(a == 1){
		                sb.append("w");
		            }else if(a == -1){
		                sb.append("s");
		            }else if(a == 10){
		                sb.append("d");
		            }else if(a == -10){
		                sb.append("a");
		            }
		        }
		        answer = sb.toString();
		        return answer;
    }
}