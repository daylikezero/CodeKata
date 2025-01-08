import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];
        for (int i = 0; i < commandsLength; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}