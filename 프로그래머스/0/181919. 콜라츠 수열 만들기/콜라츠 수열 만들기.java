import java.util.*;

class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    public int[] solution(int n) {
        int[] answer = {};
        int temp = 0;
        
        Solution(n);
        
        answer = new int[list.size()];
        
        for(int r : list){
            answer[temp] = r;
            temp++;
        }
        
        return answer;
    }
    
    public static void Solution(int x) {
		
		list.add(x);
		
		if(x == 1) return;
		
		if(x%2 == 0) {
			Solution(x/2);
		}else {
			Solution(x*3+1);
		}
		
	}
}