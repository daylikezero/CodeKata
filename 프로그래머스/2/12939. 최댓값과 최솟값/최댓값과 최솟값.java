import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        List<Integer> intList = new ArrayList<>();
        String[] split = s.split(" ");
        for (String number : split) {
            intList.add(Integer.parseInt(number));
        }

        int max = intList.stream().max(Integer::compareTo).get();
        int min = intList.stream().min(Integer::compareTo).get();

        return min + " " + max;
    }
}