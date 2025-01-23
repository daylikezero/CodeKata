import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> babbles = new ArrayList<>(List.of("aya", "ye", "woo", "ma"));
        for (String word : babbling) {
            if (babbles.contains(word)) {
                answer++;
            } else {
                // 조합하여 발음할 수 있는 단어인지 확인
                if (isPossible(word, babbles)) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static boolean isPossible(String word, List<String> babbles) {
        for (String babble : babbles) {
            if (word.contains(babble + babble)) {
                return false;
            }
            word = word.replace(babble, "0");
        }
        return word.replace("0", "").trim().isEmpty();
    }
}