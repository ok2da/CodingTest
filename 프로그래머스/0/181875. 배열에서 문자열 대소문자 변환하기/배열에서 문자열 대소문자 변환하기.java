class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        for(int i = 0; i < strArr.length; i ++){
            boolean check = i % 2 == 0 ? true : false;
            strArr[i] = check ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        
        return answer = strArr;
    }
}