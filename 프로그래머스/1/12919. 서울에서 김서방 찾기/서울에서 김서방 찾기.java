import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        String element = "Kim";
        for(int i=0; i < seoul.length; i++) {
            if ( element.equals(seoul[i]) ) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}