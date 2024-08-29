class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        String str = "";
        
        for(int i = 0; i < strArr.length; i++){
            boolean check = strArr[i].indexOf("ad") == -1 ? true : false;
            str = check ? str + strArr[i] + "," : str;
        }
        
        answer = str.equals("") ? strArr : str.split(",");
        
        return answer;
    }
}