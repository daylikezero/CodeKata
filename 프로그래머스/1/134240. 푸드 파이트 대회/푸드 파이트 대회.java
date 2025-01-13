import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        int[] array = Arrays.stream(food).map(i -> i % 2 == 0 ? i : i - 1).toArray();
        List<Integer> last = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        for (int i = 1; i < food.length ; i++) {
            while (array[i] != 0) {
                last.add(i);
                array[i]--;
                first.add(0, i);
                array[i]--;
            }
        }
        for (Integer i : last) {
            answer.append(i);
        }
        answer.append(0);
        for (Integer i : first) {
            answer.append(i);
        }
        return answer.toString();
    }
}