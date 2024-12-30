import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = { -1 };
        int min = arr[0];
        int index = 0;
        if (arr.length == 1) {
            return answer;
        }
        for(int i=1; i<arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}