class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        boolean odd_even = arr.length % 2 == 0 ? true : false;
        
        for(int i = 0; i < arr.length; i++){
            if(odd_even) i++;
            arr[i] += n;
            if(!odd_even) i++;
        }
        
        return arr;
    }
}