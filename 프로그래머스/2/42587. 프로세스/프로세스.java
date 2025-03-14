import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        boolean[] visited = new boolean[priorities.length];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int index = poll[0];
            int prior = poll[1];
            visited[index] = true;
            boolean isHigher = false;

            for (int j = 0; j < priorities.length; j++) {
                if (visited[j]) {
                    continue;
                }
                if (prior < priorities[j]) {
                    isHigher = true;
                    break;
                }
            }

            if (isHigher) {
                queue.offer(new int[]{index, prior});
                visited[index] = false;
            } else {
                answer++;
                if (index == location) {
                    break;
                }
            }
        }
        return answer;
    }
}