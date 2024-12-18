class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        int a = getGcd(arrayA);
        int b = getGcd(arrayB);
        
        // 첫째, arrA의 수들에서 b가 약수인지 확인하여 아니라면 b를 삽입
        if(check(arrayA, b)){
            answer = b;
        }
        
        // 둘째, arrB의 수들에서 a가 약수인지 확인하여 아니라면 a를 삽입하되,
        //      입출력 예 #3의 경우 서로 조건이 맞는 수가 존재하므로 더 큰수를 비교
        if(check(arrayB, a)){
            answer = Math.max(answer, a);
        }
        
        return answer;
    }
    
    public int getGcd(int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = gcd(result, arr[i]);
        }
        return result;
    }
    
    public int gcd(int a, int b){
        if(a == 0) {
            return b;
        }else {
            return gcd(b % a, a);
        }
    }
    
    public boolean check(int[] arr, int r){
        for(int a : arr){
            if(a % r == 0) return false;
        }
        return true;
    }
}