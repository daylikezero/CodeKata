import java.lang.StringBuilder;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        if (n == 0) return answer.toString();
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return answer.toString();
    }
}