class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int mid = length / 2;
        if (length % 2 == 0) {
            answer = s.charAt(mid - 1) + "" + s.charAt(mid) + "";
        } else {
            answer = s.charAt(mid) + "";
        }
        return answer;
    }
}