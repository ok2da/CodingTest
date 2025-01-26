import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] input;
        int a;
        int b;
        int result;

        for(int i = 0; i < T; i++){
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            result = 1;
            
            for(int j = 0; j < b; j++){
                result = (a * result) % 10;
                if(result == 0) {
                    result = 10;
                    break;
                }
            }
            
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
