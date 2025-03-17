import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        List<String> str = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.toList());
        str.sort((o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        });
        StringBuilder sb = new StringBuilder();
        str.forEach(str1 -> sb.append(str1));
        if (sb.toString().startsWith("0")) {
            return "0";
        }
        return sb.toString();
    }
}