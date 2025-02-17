import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0;
        long cost = 0;

        String[] road = br.readLine().split(" ");
        String[] gasStation = br.readLine().split(" ");

        // 주유 최소비용
        cost = Integer.parseInt(gasStation[0]);

        for(int i = 0; i < N - 1; i++){
            long city = Integer.parseInt(gasStation[i]);
            long distance = Integer.parseInt(road[i]);

            // 현재 도시에서 주유 비용이 더 저렴하면 갱신
            if(city < cost) {
                cost = city;
            }
            
            result += cost * distance;
        }

        System.out.println(result);
        br.close();

    }
}
