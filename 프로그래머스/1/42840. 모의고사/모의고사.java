import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                map.put(1, map.get(1) + 1);
            }
            if (answers[i] == student2[i % student2.length]) {
                map.put(2, map.get(2) + 1);
            }
            if (answers[i] == student3[i % student3.length]) {
                map.put(3, map.get(3) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> resultList = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());

        int topScore = resultList.get(0).getValue();
        for (Map.Entry<Integer, Integer> entry : resultList) {
            if (entry.getValue() == topScore) {
                answer.add(entry.getKey());
            }
        }
        return answer.stream().mapToInt(i -> i).sorted().toArray();
    }
}