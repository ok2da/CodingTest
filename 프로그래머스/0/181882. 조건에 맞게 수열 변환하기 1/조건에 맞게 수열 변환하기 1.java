class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++){
            boolean even = arr[i] % 2 == 0 && arr[i] != 0 ? true : false;
            answer[i] = arr[i] >= 50 ? even ? arr[i] / 2 : arr[i] : !even ? arr[i] * 2 : arr[i];
        }
        return answer;
    }
}