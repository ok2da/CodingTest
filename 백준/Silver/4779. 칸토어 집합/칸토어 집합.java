import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        int N;
        int len;

        while((input = br.readLine()) != null && !input.isEmpty()){
            N = Integer.parseInt(input);
            len = (int) Math.pow(3, N);
            sb.setLength(len);

            for(int i = 0; i < len; i++){
                sb.setCharAt(i, '-');
            }

            solution(0, len);
            bw.write(sb.toString() + "\n");
            sb.setLength(0);
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void solution(int index, int size){
        if(size == 1){
            return;
        }

        int split = size / 3;

        for(int i = index + split; i < index + 2 * split; i++){
            sb.setCharAt(i, ' ');
        }

        solution(index, split);
        solution(index + 2 * split, split);
    }

}
