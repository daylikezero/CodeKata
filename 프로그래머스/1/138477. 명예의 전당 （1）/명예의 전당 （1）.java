import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> hallOfFame = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            List<Integer> temp = Arrays.stream(Arrays.copyOfRange(score, 0, i+1))
                                       .boxed()
                                       .collect(Collectors.toList());
            temp = temp.stream()
                       .sorted(Comparator.reverseOrder())
                       .collect(Collectors.toList());
            if(i<k) {
                hallOfFame.add(temp.get(i));
            } else {
                hallOfFame.add(temp.get(k-1));
            }
        }
        return hallOfFame.stream().mapToInt(i->i).toArray();
    }
}