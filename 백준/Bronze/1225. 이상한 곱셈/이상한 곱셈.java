import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long result = 0;

        for(int i = 0; i < input[0].length(); i++){
            int a = input[0].charAt(i) - '0';
            for(int j = 0; j < input[1].length(); j++){
                int b = input[1].charAt(j) - '0';
                result += a * b;
            }
        }

        System.out.println(result);
        br.close();
    }

}
