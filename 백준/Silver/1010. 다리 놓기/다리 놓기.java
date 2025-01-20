import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] point = new int[30][30];
    public static void main(String args[]) throws IOException {
        // 1, 첫째 줄에 테스트 케이스 개수 "T"가 주어진다
        // 2, 그 다음줄 부터 T개 만큼 강 서쪽의 사이트 개수 N, 동쪽의 사이트 개수 M이 주어진다 ( 0 < N <= M < 30 )
            // 서쪽과 동쪽의 사이트를 이어서 다리를 만드려고 한다
            // 최대한 다리는 서로 겹쳐질 수 없다
        // 3, 각 테스트 케이스에 주어진 조건하에 다리를 지을 수 있는 경우의 수를 출력한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(builder(M,N));
        }

        br.close();
    }

    private static int builder(int n, int r) {

        if(point[n][r] > 0){
            return point[n][r];
        }

        if(n == r || r == 0){
            return point[n][r] = 1;
        }

        return point[n][r] = builder(n - 1, r - 1) + builder(n - 1, r);
    }
}
