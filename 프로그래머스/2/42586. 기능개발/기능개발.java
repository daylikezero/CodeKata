import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployList = new ArrayList<>();
        Queue<Integer> task = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            task.offer(days);
        }
        while (!task.isEmpty()) {
            int releaseDay = task.poll();
            int releaseCount = 1;
            while (!task.isEmpty() && task.peek() <= releaseDay) {
                task.poll();
                releaseCount++;
            }
            deployList.add(releaseCount);
        }
        return deployList.stream().mapToInt(i -> i).toArray();
    }
}