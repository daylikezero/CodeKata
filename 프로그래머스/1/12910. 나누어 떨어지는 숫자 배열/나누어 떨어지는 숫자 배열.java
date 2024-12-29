import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        for( int element : arr ) {
            if ( element % divisor == 0 ) {
                answerList.add(element);
            }
        }
        answerList.sort(Integer::compareTo);
        if(!answerList.isEmpty()){
            answer = new int[answerList.size()];
            for (int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}