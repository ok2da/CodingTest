import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("-");
        int result = 0;

        for(int i = 0; i < input.length; i++){
            // + 는 정규표현식에서 메타문자로 구분자로 사용하려면 이스케이프 처리 해야함
            String[] element = input[i].split("\\+");
            int temp = 0;

            for(int j = 0; j < element.length; j++){
                temp += Integer.parseInt(element[j]);
            }

            if(i == 0){
                result += temp;
            }else {
                result -= temp;
            }
        }

        System.out.println(result);
        br.close();

    }
}
