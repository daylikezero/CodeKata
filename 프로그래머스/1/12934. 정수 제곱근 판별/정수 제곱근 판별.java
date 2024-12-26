class Solution {
    public long solution(long n) {
        long answer = -1L;
        double x = Math.sqrt((double)n);
        if (x % 1 == 0) {
            answer = (long) Math.pow(x+1, 2);
        }
        return answer;
    }
}