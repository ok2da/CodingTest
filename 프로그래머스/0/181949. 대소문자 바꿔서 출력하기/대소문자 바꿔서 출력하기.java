import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] ch = a.toCharArray();
		
		for(char c : a.toCharArray() ) {
			if ( Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
					
			}else {
				System.out.print(Character.toUpperCase(c));
			}
		}	
	}
    
    
}