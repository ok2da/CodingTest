import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int result = N - (N % 100);

        while(result % F != 0){
            result++;
        }

        br.close();

        if(result % 100 < 10){
            System.out.println("0" + result % 100);
        }else {
            System.out.println(result % 100);
        }

    }
}
