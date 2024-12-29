class Solution {
    // 어피치와 라이언의 점수 차이, 어피치 스코어(info), 최종 라이언 스코어
    static int maxScoreDifference = 0;
    static int[] apeach;
    static int[] result;
    
    public int[] solution(int n, int[] info) {
        int[] answer = {-1};
        
        apeach = info;
        
        archery(new int[11], n, 0);
        
        if(maxScoreDifference != 0 && result != null){
            answer = result;    
        }
        
        return answer;
    }
    
    public static void archery(int[] ryan, int arrowCount, int index) {

        if(index == 11){
            int scoreApeach = 0;
            int scoreRyan = 0;
            int scoreDifference = 0;

            for(int i = 0; i < 11; i++){
                if(apeach[i] > ryan[i]){
                    scoreApeach += 10 - i;
                }else if(apeach[i] < ryan[i]){
                    scoreRyan += 10 - i;
                }
            }

            scoreDifference = scoreRyan - scoreApeach;

            if(scoreDifference > maxScoreDifference){
                result = ryan.clone();
                maxScoreDifference = scoreDifference;
            }else if(scoreDifference == maxScoreDifference){
                if(result == null){
                    return;
                }else {
                    for(int j = 10; j >= 0; j--){
                    if(result[j] != 0) {
                        break;
                    }else if(ryan[j] != 0){
                        result = ryan.clone();
                        maxScoreDifference = scoreDifference;
                        break;
                    }
                }
                }
            }
            return;
        }

         int hit = index < 10 ? apeach[index] + 1 : arrowCount;

        if(arrowCount >= hit) {
            ryan[index] = index < 10 ? hit : arrowCount;
            archery(ryan, arrowCount - hit, index + 1);
            ryan[index] = 0;
        }
        archery(ryan, arrowCount, index + 1);

    }
}