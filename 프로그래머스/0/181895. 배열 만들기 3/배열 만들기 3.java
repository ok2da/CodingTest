class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        int index = ((b1-a1)+1) + ((b2-a2)+1);

        int[] answer = new int[index];
        
        int start1 = 0;
        int start2 = (b1-a1)+1;
        
        
        while(true){
            if(a1 <= b1) answer[start1++] = arr[a1++];
            if(a2 <= b2) answer[start2++] = arr[a2++];
            if(a1 > b1 && a2 > b2) break;
        }
        
        return answer;
    }
}