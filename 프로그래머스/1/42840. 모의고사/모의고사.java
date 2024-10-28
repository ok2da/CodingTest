class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] result = new int[3];
        int max = 0;
        int len = 0;

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length; i++){
            if(one[i % 5] == answers[i]) result[0]++;
            if(two[i % 8] == answers[i]) result[1]++;
            if(three[i % 10] == answers[i]) result[2]++;
        }

        max = Math.max(result[0], Math.max(result[1], result[2]));
        
        if(result[0] == max) len++;
        if(result[1] == max) len++;
        if(result[2] == max) len++;

        answer = new int[len];

        if(result[2] == max) answer[--len] = 3;
        if(result[1] == max) answer[--len] = 2;
        if(result[0] == max) answer[--len] = 1;
        
        return answer;
    }
}