class Solution {
    public String solution(String new_id) {
        String answer = "";
   
        new_id = step_one(new_id);
        new_id = step_two(new_id);
        new_id = step_three(new_id);
        new_id = step_four(new_id);
        new_id = step_five(new_id);
        new_id = step_six(new_id);
        new_id = step_seven(new_id);
        answer = new_id;
        
        return answer;
    }
    
    public String step_one(String str){
        return str.toLowerCase();
    }
    public String step_two(String str){
        return str.replaceAll("[^a-z0-9-_.]","");
    }
    public String step_three(String str){
        return str.replaceAll("\\.{2,}",".");
    }
    public String step_four(String str){
        return str.replaceAll("^\\.|\\.$","");
    }
    public String step_five(String str){
        return str.equals("") ? "a" : str;
    }
    public String step_six(String str){
        if(str.length() >= 16) {
            return str.substring(0,15).replaceAll("\\.$","");
        }else {
            return str;
        }
    }
    public String step_seven(String str){
        if(str.length() == 1) str += str.charAt(0);
        if(str.length() == 2) str += str.charAt(1);
        return str;
    }

}