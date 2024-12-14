import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 두 번째 컬럼을 기준으로 오름차순 정렬
                if (o1[col - 1] != o2[col - 1]) {
                    return Integer.compare(o1[col - 1], o2[col - 1]);
                }
                // 두 번째 컬럼 값이 같으면, 첫 번째 컬럼을 기준으로 내림차순 정렬
                return Integer.compare(o2[0], o1[0]);
            }
        });

        // row_begin ~ row_end 의 범위 계산
        for(int i = row_begin - 1; i < row_end; i++){
            int mod = 0;
            for(int j = 0; j < data[0].length; j++){
                mod += data[i][j] % (i + 1);
            }
            if(row_begin == i + 1){
                answer = mod;
            }else {
                answer = answer ^ mod;
            }
        }
        
        return answer;
    }
}