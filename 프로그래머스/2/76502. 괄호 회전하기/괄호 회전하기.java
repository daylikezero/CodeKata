import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] ch = Arrays.copyOf(s.toCharArray(), s.length());

        int index = 0;
        int count = 0;

        while (index < ch.length) {
            if (isCorrect(ch)) {
                count++;
            }
            ch = moveChar(ch);
            index++;
        }
        return count;
    }
    
    private boolean isCorrect(char[] ch) {
        Stack<Character> stack = new Stack<>();
        int count = -1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
                count++;
            } else {
                char end = 'Z';
                if (ch[i] == ')') {
                    end = '(';
                }
                if (ch[i] == '}') {
                    end = '{';
                }
                if (ch[i] == ']') {
                    end = '[';
                }
                if (!stack.isEmpty() && end == stack.peek()) {
                    stack.pop();
                }
            }
        }
        if (count == -1) return false;
        return stack.size() == 0 ? true : false;
    }

    private char[] moveChar(char[] ch) {
        char[] temp = Arrays.copyOf(ch, ch.length);
        for (int i = 0; i < ch.length; i++) {
            temp[i] = ch[(i + 1) % ch.length];
        }
        return temp;
    }
}