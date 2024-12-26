import java.lang.Integer;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(sb.charAt(i)+"");
        }
        return answer;
    }
}