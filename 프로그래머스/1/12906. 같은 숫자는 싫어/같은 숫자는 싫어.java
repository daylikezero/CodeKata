import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                queue.offer(arr[i]);
                continue;
            }
            if (arr[i] != arr[i-1])
                queue.offer(arr[i]);
        }
        int[] answer = queue.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}