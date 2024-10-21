class Solution {
    public String solution(String new_id) {
        String answer = "";
   
        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]","");

        new_id = new_id.replaceAll("\\.{2,}",".");

        if(new_id.length() >= 1){
            if(new_id.charAt(0) == '.') new_id = new_id.substring(1);
        }
        if(new_id.length() >= 1){
            if(new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
        }

        if(new_id.equals("")) new_id = "a";

        if(new_id.length() > 15) {
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()- 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
        }

        if(new_id.length() == 1) new_id += new_id;
        if(new_id.length() == 2) new_id += new_id.charAt(1);
        
        answer = new_id;
        
        return answer;
    }
}