import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, Integer> words = new HashMap<>();
        words.put("zero", 0);
        words.put("one", 1);
        words.put("two", 2);
        words.put("three", 3);
        words.put("four", 4);
        words.put("five", 5);
        words.put("six", 6);
        words.put("seven", 7);
        words.put("eight", 8);
        words.put("nine", 9);

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(s.contains(entry.getKey())) {
                s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return Integer.parseInt(s);
    }
}