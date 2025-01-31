import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] pattern = br.readLine().toCharArray();
        int size = pattern.length;

        for(int i = 1; i < N; i ++){
            char[] filename = br.readLine().toCharArray();
            for(int j = 0; j < size; j++){
                if(pattern[j] != filename[j]) pattern[j] = '?';
            }
        }

        System.out.println(pattern);
        br.close();

    }


}