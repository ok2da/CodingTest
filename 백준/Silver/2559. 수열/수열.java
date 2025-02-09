import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        arr[0] = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        // 누적합
        for(int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int j = K; j <= N; j++) {
            sum = arr[j] - arr[j - K];
            if(max < sum) max = sum;
        }

        System.out.println(max);
        br.close();

    }
}
