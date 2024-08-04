import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
		int[] num = {a,b,c,d};			// 배열 생성
		
		Arrays.sort(num);				// 계산을 조금 더 쉽게 하기 위한 정렬
		
		if(num[0] == num[3]) {								// a,b,c,d 모두 같을 때
			return 1111 * num[0];
		}else if(num[0] == num[1] && num[1] == num[2]) {	// a,b,c는 같고, d는 다를 때
			return (int) Math.pow((10 * num[0] + num[3]), 2);
		}else if(num[0] == num[1] && num[2] == num[3]) {	// a,b가 같고, c,d가 같을 때
			return (num[0] + num[2]) * Math.abs(num[0] - num[2]);
		}else if(num[0] == num[1] && num[2] != num[3]) {	// a,b가 같고, c와 d가 서로 다를 때
			return num[2] * num[3];
		}else if(num[1] == num[2] && num[2] == num[3]) {	// a가 다르고, b,c,d가 같을 때
			return (int) Math.pow((10 * num[1] + num[0]), 2);
		}else if(num[1] == num[2]) {						// a가 다르고, b,c가 같고, d가 다를 때
			return num[0] * num[3];
		}else if(num[2] == num[3]) {						// a가 다르고, b가 다르고, c,d가 같을 때
			return num[0] * num[1];
		}else {												// 모두 다를 때
			return num[0];
		}

        
    }
}