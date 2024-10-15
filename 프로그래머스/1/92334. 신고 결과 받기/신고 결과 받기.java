import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
 
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], 0);
            map2.put(id_list[i], "");
            list.add(id_list[i]);
        }
        
        for(int j = 0; j < report.length; j++){
            int index = report[j].indexOf(" ");
            String user1 = report[j].substring(0, index);
            String user2 = report[j].substring(index + 1);
            
            if(!set.contains(report[j])){
                map.put(user2, map.get(user2) + 1);
                map2.put(user2, map2.get(user2) + user1 + ",");
            }
            
            set.add(report[j]);
        }
        
        for(int r = 0; r < id_list.length; r++){
            String user = id_list[r];
            
            if(map.get(user) >= k){
                String[] userlist = map2.get(user).split(",");
                for(String u : userlist){
                    int index2 = list.indexOf(u);
                    answer[index2]++;
                }
            }
        }
        
        return answer;
    }
}