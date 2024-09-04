import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }else {
                rank[i] = 101;
                list.add(101);
            }
        }
        
        Arrays.sort(rank);

        answer = 10000 * list.indexOf(rank[0]) + 100 * list.indexOf(rank[1]) + list.indexOf(rank[2]);
        
        return answer;
    }
}