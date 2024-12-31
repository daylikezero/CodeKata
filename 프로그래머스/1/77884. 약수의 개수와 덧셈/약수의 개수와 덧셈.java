import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            answer += getCommons(i);
        }
        return answer;
    }
    
    public static int getCommons(int num) {
        List<Integer> commons = new ArrayList<>();
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                commons.add(i);
            }
        }
        return commons.size() % 2 == 0 ? num : -num;
    }
}