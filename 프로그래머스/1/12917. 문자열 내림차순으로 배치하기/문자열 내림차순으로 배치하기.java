import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        chars.sort(Character::compareTo);
        for (int i = 0; i < chars.size(); i++) {
            answer.append(chars.get(i));
        }
        return answer.reverse().toString();
    }
}