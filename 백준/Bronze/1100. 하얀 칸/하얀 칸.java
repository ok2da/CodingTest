import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int widthSize = 8;
        int heightSize = 8;
        int result = 0;
        String[] input;

        for(int i = 0; i < heightSize; i++){
            input = br.readLine().split("");
            for(int j = 0; j < widthSize; j++){
                if(i % 2 == 0 && j % 2 == 0) {
                    if(input[j].equals("F")) result++;
                }else if(i % 2 != 0 && j % 2 != 0){
                    if(input[j].equals("F")) result++;
                }
            }
        }
        
        br.close();
        System.out.println(result);
    }
}
