class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] numbers = conversionNumber(n, k).split("0");

        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i].equals("")){
                Long number = Long.parseLong(numbers[i]);
                if(isprime(number)) answer++;
            }
        }

        return answer;
    }

    public static String conversionNumber(int n, int k){
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            int num = n % k;
            sb.append(num);
            n /= k;
        }

        return sb.reverse().toString();
    }

    public static boolean isprime(long num){

        if(num == 1) return false;

        for(long i = 3; i * i <= num; i += 2){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}