import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        int select = N - 1;
        int amount = K;
        int count = 0;

        for(int i = 0; i < N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        while(amount != 0){
            if(coin[select] <= amount){
                count += amount / coin[select];
                amount = amount % coin[select];
            }
            select--;
        }

        System.out.println(count);
        br.close();

    }
}
