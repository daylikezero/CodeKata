import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int hIndex = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i <= citations.length - 1; i++) {
            if (citations[i] >= hIndex) {
                break;
            } else {
                hIndex--;
            }
        }
        return hIndex;
    }
}