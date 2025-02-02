import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int result;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        cycle(N);

        System.out.println(result);
        br.close();
    }

    public static void cycle(int number) {
        int a = number % 10;
        int b = ((number / 10) + (number % 10)) % 10;

        number = a * 10 + b;

        result++;

        if(N == number) {
            return;
        }else {
            cycle(number);
        }
    }
}
