import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] file = br.readLine().split(" ");
        long clusterSize = Long.parseLong(br.readLine());
        long count = 0;
        long result = 0;

        for(int i = 0; i < N; i++){
            long fileSize = Long.parseLong(file[i]);
            if(fileSize != 0){
                count += fileSize / clusterSize;
                count += fileSize % clusterSize == 0 ? 0 : 1;
            }
        }

        result = clusterSize * count;

        System.out.println(result);
        br.close();
    }

}
