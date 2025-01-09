import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
//        return Arrays.stream(strings).sorted((s1, s2)-> {
//            int cmp = Character.compare(s1.charAt(n), s2.charAt(n));
//            return cmp != 0 ? cmp : s1.compareTo(s2);
//        }).toArray(String[]::new);
        return Arrays.stream(strings)
                     .sorted(Comparator.comparingInt(
                         (String s) -> s.charAt(n))
                             .thenComparing(s -> s))
                     .toArray(String[]::new);
    }
}