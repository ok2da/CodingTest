class Solution {
    public int[] solution(int[] arr, int n) {
        //int[] answer = {};
        int index = arr.length % 2 == 0 ? 1 : 0;
        
        for(int i = index; i < arr.length; i += 2) arr[i] += n;
        
        return arr;
    }
}