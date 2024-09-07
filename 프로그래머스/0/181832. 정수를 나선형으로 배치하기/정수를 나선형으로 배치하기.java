class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = 0;
        int min = 0;
        int max = n - 1;
        boolean a = false;
        boolean b = false;
        
        while(num <= n*n){
            answer[y][x] = num;
            
            if(x == max && y == min){
                a = true;
            }else if(x == max && y == max){
                b = true;
            }else if(x == min && y == max){
                a = false;
                min++;
            }else if(x == min - 1 && y == min){
                b = false;
                max--;
            }
            
            if(!a && !b){
                x++;
                num++;
            }else if(a && !b){
                y++;
                num++;
            }else if(a && b){
                x--;
                num++;
            }else if(!a && b){
                y--;
                num++;
            }
            
        }
        
        return answer;
    }
}