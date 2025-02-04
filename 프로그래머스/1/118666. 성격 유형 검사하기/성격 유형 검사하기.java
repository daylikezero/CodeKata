import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            if (choices[i] < 4) {
                String s = String.valueOf(survey[i].charAt(0));
                map.put(s, map.getOrDefault(s, 0) + 4 - choices[i]);
            }
            if (choices[i] > 4) {
                String s = String.valueOf(survey[i].charAt(1));
                map.put(s, map.getOrDefault(s, 0) + choices[i] - 4);
            }
        }

        sb.append(map.get("T") > map.get("R") ? "T" : "R");
        sb.append(map.get("F") > map.get("C") ? "F" : "C");
        sb.append(map.get("M") > map.get("J") ? "M" : "J");
        sb.append(map.get("N") > map.get("A") ? "N" : "A");

        return sb.toString();
    }
}