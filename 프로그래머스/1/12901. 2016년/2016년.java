class Solution {
    public String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int totalDays = b - 1 + 5;
        for (int i = 0; i < a; i++) {
            totalDays += days[i];
        }

        return week[totalDays % 7];
    }
}