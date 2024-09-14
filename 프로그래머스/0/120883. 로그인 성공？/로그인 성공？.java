class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i = 0; i < db.length; i++){
            String id = id_pw[0];
            String pw = id_pw[1];
            String dbid = db[i][0];
            String dbpw = db[i][1];
            
            if(id.equals(dbid) && pw.equals(dbpw)){
                answer = "login";
                break;
            }else if(id.equals(dbid)){
                answer = "wrong pw";
            }else if(!answer.equals("wrong pw")){
                answer = "fail";
            }
            
            
        }
        
        return answer;
    }
}