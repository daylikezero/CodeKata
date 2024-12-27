class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < sb.length()-1; i++) {
            for(int j=i+1; j<sb.length(); j++){
                if(sb.charAt(i) < sb.charAt(j)){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
        return Long.parseLong(sb.toString());
    }
}