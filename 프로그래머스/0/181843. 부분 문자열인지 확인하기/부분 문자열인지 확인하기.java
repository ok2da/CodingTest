class Solution {
    public int solution(String my_string, String target) {
        int answer = my_string.indexOf(target) == -1 ? 0 : 1;
        return answer;
    }
}