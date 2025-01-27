import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());	
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int number = Integer.valueOf(st.nextToken());
			int number2 = 0;
			if(st.hasMoreTokens()) {
				number2 = Integer.valueOf(st.nextToken());	
			}
			int result = 0;
			int index = stack.size();
			
			switch(number){
				case 1:
					stack.push(number2);
					break;
				case 2:
					if(!stack.isEmpty()) {
						result = stack.pop();
					}else {
						result = -1;
					}
					bw.write(String.valueOf(result) + "\n");
					break;
				case 3:
					result = stack.size();
					bw.write(String.valueOf(result) + "\n");
					break;
				case 4:
					if(stack.isEmpty()) {
						result = 1;
					}else {
						result = 0;
					}
					bw.write(String.valueOf(result) + "\n");
					break;
				case 5:
					if(!stack.isEmpty()) {
						result = stack.peek();
						
					}else {
						result = -1;
					}
					bw.write(String.valueOf(result) + "\n");
					break;
			}
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
