import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] locker = new int[n];
        Arrays.fill(locker, 1);
        for (int i : lost) {
            locker[i - 1]--;
        }
        for (int i : reserve) {
            locker[i - 1]++;
        }
        for (int i = 0; i < locker.length; i++) {
            if (locker[i] == 1 || locker[i] == 2) continue;
            if (i != 0) {
                if (locker[i - 1] == 2) {
                    locker[i - 1]--;
                    locker[i]++;
                    continue;
                }
            }
            if (i != locker.length - 1) {
                if (locker[i + 1] == 2) {
                    locker[i + 1]--;
                    locker[i]++;
                }
            }
        }
        for (int i = 0; i < locker.length; i++) {
            if (locker[i] == 2) {
                locker[i] = 1;
            }
            answer += locker[i];
        }
        return answer;
    }
}