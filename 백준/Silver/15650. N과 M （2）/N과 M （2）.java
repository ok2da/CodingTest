import java.io.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        arr = new int[M];
        sb = new StringBuilder();

        dfs(1, 0);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int depth){
        if(depth == M){
            for(int a : arr){
                sb.append(a);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= N; i++){
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

}
