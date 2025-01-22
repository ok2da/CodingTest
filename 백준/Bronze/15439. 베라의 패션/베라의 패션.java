import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        // 1, 상의와 하의 각각의 개수인 "N" 이 주어진다 ( 1 <= N <= 2017 )
            // i번째 상의와 i번째 하의는 모두 색상 i를 가진다 ( 같은 번째 상,하의는 색상이 같다 )
        // 2, 상의와 하의가 모두 다른 색상의 조합을 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();
        
        System.out.println(N * (N-1));
    }
}