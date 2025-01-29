import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {

        //1, 첫 번째로 정수 "K" 입력 ( 1 <= K <= 100000 )
        //2, 둘째 줄 부터 "K" 만큼 정수 1개씩 주어짐 ( 0 <= 정수 <= 1000000 )
            // 정수가 0일 경우 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다
        //3, 마지막 수의 총 합을 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if(number == 0) {
                result -= stack.pop();
            }
            if(number != 0) {
                stack.push(number);
                result += number;
            }

        }

        br.close();
        bw.write(String.valueOf(result));
        bw.close();

    }
}