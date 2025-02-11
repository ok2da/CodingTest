import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] meetingRoom = new int[N][2];
        int now = 0;
        int result = 0;

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            meetingRoom[i][0] = Integer.parseInt(input[0]);
            meetingRoom[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(meetingRoom, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        for(int j = 0; j < N; j++){
            if(now <= meetingRoom[j][0]){
                now = meetingRoom[j][1];
                result++;
            }
        }

        System.out.println(result);
        br.close();

    }
}
