import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        // 첫번째 글자는 항상 -1
        list.add(-1);
        for (int i = 1; i < s.length(); i++) {
            String target = s.substring(0, i);
            int last = target.lastIndexOf(s.charAt(i));
            if (last != -1) {
                list.add(i - last);
            } else {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}