import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        arr[0] = 0;
        
        // 누적합
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt() + arr[i - 1];
        }

        for(int j = 0; j < M; j++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int result = arr[end] - arr[start - 1];
            System.out.println(result);
        }

        sc.close();
    }

}