class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        // 첫번째 글자는 항상 -1
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            String target = s.substring(0, i);
            int last = target.lastIndexOf(s.charAt(i));
            if (last != -1) {
                answer[i] = i - last;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}