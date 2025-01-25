class Solution {
    public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countOthers = 0;
        char x = 0;

        for (int i = 0; i < s.length(); i++) {
            if (countX == 0 && countOthers == 0) {
                x = s.charAt(i);
                countX++;
            } else {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOthers++;
                }
            }

            if (countX == countOthers) {
                answer++;
                countX = 0;
                countOthers = 0;
            }
        }

        if (countX != 0 || countOthers != 0) answer++;
        return answer;
    }
}