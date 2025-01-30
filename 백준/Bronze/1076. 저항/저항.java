import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        long[] zeroCount = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};

        int a = getColorValue(br.readLine());
        int b = getColorValue(br.readLine());
        int c = getColorValue(br.readLine());
        
        long result = (a * 10 + b) * zeroCount[c];

        System.out.println(result);
        br.close();
    }

    public static int getColorValue(String color){
        switch(color){
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "grey": return 8;
            case "white": return 9;
        }
        return -1;
    }

}
