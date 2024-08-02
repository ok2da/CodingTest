import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};

        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        
		 while (i < arr.length) {
	            if (list.isEmpty()) {
	                list.add(arr[i]);
	                i++;
	            } else if (list.get(list.size() - 1) < arr[i]) {
	                list.add(arr[i]);
	                i++;
	            } else if (list.get(list.size() - 1) >= arr[i]) {
	                list.remove(list.size() - 1);
	            }
	    }
        
        stk = new int[list.size()];
        int temp = 0;
        
        for(int r: list){
            stk[temp] = list.get(temp);
            temp++;
        }
        
        return stk;
    }
}