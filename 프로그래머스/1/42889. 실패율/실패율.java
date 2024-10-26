import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int player = stages.length;

        int[] step = new int[502];
        List<Double> list = new ArrayList<>();
        List<Double> index = new ArrayList<>();

        for(int i = 0; i < stages.length; i++){
            step[stages[i]]++;
        }

        for(int j = 0; j < N; j++){
            if(player != 0){
                list.add((1.0 * step[j + 1]) / player);
                index.add(list.get(j));
            }else {
                list.add(0.0);
                index.add(0.0);
            }
            player -= step[j + 1];
        }

        Collections.sort(list);

        for(int k = 0; k < N; k++){
            answer[k] = index.indexOf(list.get((N - 1) - k)) + 1;
            index.set(index.indexOf(list.get((N - 1) - k)), -1.0);

            list.set((N - 1) - k, -1.0);
        }
        
        return answer;
    }
}