class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>= 'a' && s.charAt(i)<= 'z') {
                // 97('a') ~ 122('z')
                int shift = (s.charAt(i) - 'a' + n) % 26 + 'a';
                sb.append(Character.toChars(shift));
            } else if (s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') {
                // 65('A') ~ 90('Z') 
                int shift = (s.charAt(i) - 'A' + n) % 26 + 'A';
                sb.append(Character.toChars(shift));
            } else {
                // 공백문자
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}