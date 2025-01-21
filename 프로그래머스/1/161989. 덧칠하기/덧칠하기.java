class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        for(int sec : section) {
            if (last <= sec) {
                last = sec + m;
                answer++;
            }
        }
        return answer;
    }
}