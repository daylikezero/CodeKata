import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int str = getDivisorCount(i) > limit ? power : getDivisorCount(i);
            answer += str;
        }
        return answer;
    }
    
    public static int getDivisorCount(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) { // 약수 중 작은 수
                list.add(i);
                if (number / i != i) { // 약수 중 큰 수
                    list.add(number / i);
                }
            }
        }
        return list.size();
    }
}