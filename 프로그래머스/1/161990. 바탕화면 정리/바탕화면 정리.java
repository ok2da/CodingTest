class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++){
            String folder = wallpaper[i];
            boolean next = false;
            for(int j = 0; j < folder.length(); j++){
                int index = folder.indexOf("#");
                if(index != -1) {
                    next = true;
                    folder = folder.substring(0, index) + "." + folder.substring(index + 1);
                    if(lux > i) lux = i;
                    if(luy > index) luy = index;
                    if(rdx < i + 1) rdx = i + 1;
                    if(rdy < index + 1) rdy = index + 1;
                }else {
                    break;
                }
            }
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        return answer;
    }
}