class Solution {
    public int[] solution(String myString) {
        int plus = myString.lastIndexOf("x") == myString.length() - 1 ? 1 : 0;
        int[] answer = new int[myString.split("x").length + plus];
        
        int index = 0;
        
        for(int i = 0; i < myString.length(); i++) {
        	int num = myString.charAt(i) == 'x' ? 0 : 1;
        	answer[index] += num;
        	if(num == 0) index++;
        }
        
        
        return answer;
    }
}