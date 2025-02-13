class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("\\s", -1);
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                String upperCase = split[i].substring(0, 1).toUpperCase();
                String lowerCase = split[i].substring(1).toLowerCase();
                sb.append(upperCase).append(lowerCase);
            }
            if (i < split.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}