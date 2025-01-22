import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] win = {6, 6, 5, 4, 3, 2, 1};
        int min = 0;
        // win_nums에 포함되는 숫자의 개수
        for (int lotto : lottos) {
            for (int winNum : win_nums) {
                if(lotto == winNum) {
                    min++;
                }
            }
        }
        // 0의 개수
        int countZero = Arrays.stream(lottos).filter(i -> i==0).toArray().length;
        answer[0] = win[min + countZero];
        answer[1] = win[min];
        return answer;
    }
}