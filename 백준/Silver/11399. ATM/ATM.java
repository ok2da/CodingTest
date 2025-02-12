import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] P = br.readLine().split(" ");
        int sum = 0;
        int result = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(P[i]);
        }

        Arrays.sort(arr);

        for(int j = 0; j < N; j++){
            sum += arr[j];
            result += sum;
        }

        System.out.println(result);
        br.close();

    }
}
