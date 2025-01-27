import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                if (map.containsKey(ch)) {
                    if (map.get(ch) > i) {
                        map.replace(ch, i+1);
                    }
                } else {
                    map.put(ch, i+1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);
                if (map.containsKey(ch)) {
                    sum += map.get(ch);
                } else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}