import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0;

        String[] road = br.readLine().split(" ");
        String[] gasStation = br.readLine().split(" ");

        for(int i = 0; i < N - 1; i++){
            int start = Integer.parseInt(gasStation[i]);
            int end = Integer.parseInt(gasStation[i + 1]);
            int distance = Integer.parseInt(road[i]);

            if(start >= end){
                result += start * distance;
            }else {
                result += start * distance;
                result += start * Integer.parseInt(road[i + 1]);
                i++;
            }
        }

        System.out.println(result);
        br.close();

    }
}
