class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int count = index;
            while (true) {
                c = (char) (c + 1);
                char code = (char) (((int) c % 'a' % 26 + 'a'));
                if (!skip.contains(String.valueOf(code))) {
                    count--;
                    if (count == 0) {
                        sb.append(code);
                        break;
                    }
                    ;
                }
            }
        }
        return sb.toString();
    }
}