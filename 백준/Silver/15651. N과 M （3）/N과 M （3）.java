import java.io.*;

public class Main {

    static int N;
    static int M;
    static int arr[];
    static StringBuilder sb;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        arr = new int[M];
        sb = new StringBuilder();

        dfs(0);
        
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();

    }

    public static void dfs(int depth){

        if(depth == M){
            for(int a : arr){
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++){
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
