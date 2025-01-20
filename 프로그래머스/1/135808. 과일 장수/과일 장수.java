import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int n = score.length;
        for (int i = n - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }
}